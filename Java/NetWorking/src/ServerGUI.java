

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.io.*;
import java.net.*;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.*;
import java.util.zip.GZIPOutputStream;
import javax.swing.SwingUtilities;

public class ServerGUI extends JFrame implements ActionListener {

public JList online;
private JTextField ipaddress, textMessage;
private JButton send, start, disconnect;
private JTextArea chatArea;
private JLabel port;
int client[] = new int[100];
private ObjectOutputStream out[] = new ObjectOutputStream[client.length + 1];
private ObjectInputStream in[] = new ObjectInputStream[client.length + 1];
String username[] = new String[client.length + 1];
static String b;
public String nm, usm;
private ServerSocket server;
private Socket connect;
boolean success = true;
int id = 0;
ArrayList<String> UserList = new ArrayList<String>();


public ServerGUI() {
    Container c = getContentPane();
    c.setLayout(new BorderLayout());
    c.setPreferredSize(new Dimension(650, 500));


    JPanel p = new JPanel();
    p.setLayout(new FlowLayout());
    p.setBackground(Color.LIGHT_GRAY);
    p.add(port = new JLabel("Port No"));
    p.add(ipaddress = new JTextField("1500"));
    p.add(start = new JButton("START"));
    p.add(disconnect = new JButton("DISCONNECT"));
    disconnect.setEnabled(false);
    start.setBorderPainted(false);
    start.setBackground(Color.blue);
    start.setForeground(Color.WHITE);
    disconnect.setBorderPainted(false);
    disconnect.setBackground(Color.blue);
    disconnect.setForeground(Color.WHITE);
    ipaddress.setCaretPosition(0);

    JPanel p1 = new JPanel();
    p1.setLayout(new FlowLayout());
    p1.setBackground(Color.LIGHT_GRAY);
    p1.add(chatArea = new JTextArea());

    chatArea.setPreferredSize(new Dimension(300, 350));
    chatArea.setLineWrap(true);
    chatArea.setEditable(false);

    JPanel p2 = new JPanel();
    p2.setLayout(new FlowLayout());
    p2.setBackground(Color.LIGHT_GRAY);
    p2.add(textMessage = new JTextField(20));

    p2.add(send = new JButton("SEND"));
    send.setBackground(Color.blue);
    send.setForeground(Color.WHITE);
    send.setBorderPainted(false);

    start.addActionListener(this);
    send.addActionListener(this);


    c.add(p, BorderLayout.NORTH);
    c.add(p1, BorderLayout.CENTER);
    c.add(p2, BorderLayout.SOUTH);


}
//current time
SimpleDateFormat log = new SimpleDateFormat("HH:mm");
String d = log.format(new Date());

//Start server
public void Start() {

    int portNo = 0;
    try {

        String no = ipaddress.getText();
        portNo = Integer.parseInt(no);
        chatArea.append("Connection to port " + portNo + "...\n");
        server = new ServerSocket(portNo);
        success = true;

    } catch (Exception ex) {
        chatArea.append("Error cannot bind to port \n");
        success = false;
    }

    if (success == true) {
        addClient ob1 = new addClient("RunServer");
        start.setEnabled(false);
        disconnect.setEnabled(true);
    }
}

public class addClient implements Runnable {

    Thread t;

    addClient(String tot) {
        t = new Thread(this, tot);
        t.start();
    }

    public void run() {
        while (true) {
            try {
                try {
                    WaitClient();
                } catch (Exception ex) {
                    break;
                }

                for (int i = 0; i < client.length; i++) {
                    if (client[i] == 0) {
                        client[i] = i + 1;
                        id = i;
                        break;
                    }
                }

                //set stream to send and receive data
                out[client[id]] = new ObjectOutputStream(connect.getOutputStream());
                out[client[id]].flush();
                in[client[id]] = new ObjectInputStream(connect.getInputStream());
                chatArea.append(d + " Client:[" + client[id] + "] : Connected successful \n");
                chatArea.setCaretPosition(chatArea.getText().length());
                //inform user that connection is successfull                    
                ChatMessage cm = (ChatMessage) in[client[id]].readObject(); // read client username
                if(cm.type.equals("login")){
                    chatArea.append("User " +cm.sender + " connected successfully" + "\n" );
                    username[client[id]] = cm.sender;
                    System.out.println(username[0]+ username[1]+ username[2]);
                    send(client[id], new ChatMessage("login", username[client[id]], "user", "SERVER"));
                    sendUserList(cm.sender);
                    Announce("newuser", "SERVER", cm.sender);




                }




                Chat c = new Chat(client[id], "StartChat" + client[id]); // make new thread for every new client 

            } catch (Exception e) {
                e.printStackTrace();
            }
        }


    }

}

public class Chat implements Runnable {

    int id1;
    Chat ob1;
    Thread t;

    Chat(int id1, String info1) {
        this.id1 = id1; // create a thread for client
        t = new Thread(this, info1);
        t.start();
    }

    public void run() {
     boolean running = true;
       while(running){
            try {
                ChatMessage cm = (ChatMessage) in[client[id]].readObject(); // read client username
                if(cm.type.equals("message")){

                         send(findUserThread(cm.recipient), new ChatMessage(cm.type, cm.sender, cm.content, cm.recipient));


                }

            } catch (Exception e) {

            }
       }

    }
}




//wait for connection, then display connection information
private void WaitClient() throws IOException {

    chatArea.append(d + " : Waiting for connection... \n");
    connect = server.accept();

    chatArea.append(d + " : Now connected to " + connect.getInetAddress().getHostName() + "\n");
}

//send message to specific user
public void sendUser(int number, String info) {

    try {
        out[number].writeObject(info);
        out[number].flush();
    } catch (Exception e) {
    }

}

public void sendServer(String por) {
    for (int i = 0; i < client.length; i++) // for loop trying to send message from server to all clients 
    {
        if (client[i] != 0) // this line stop server to send messages to offline clients
        {
            try {
                out[i + 1].writeObject(por);
                out[i + 1].flush();
            } catch (Exception e) {
            }
        }
    }
}

public void Announce(String type, String sender, String content){

    ChatMessage cm = new ChatMessage(type, sender, content, "All");
    for(int i = 0; i < id; i++){
        send(client[i], cm);
    }
}



public void send(int number, ChatMessage cm) {

    try {
        out[number].writeObject(cm);
        out[number].flush();
    } catch (Exception e) {
    }

}





void sendAll(int num, String por) {
    for (int i = 0; i < client.length; i++) // for loop trying to send message from server to all clients 
    {
        if (client[i] != 0) // this line stop server to send messages to offline clients (if "clientNiz[X] = 0" don't try to send him message, because that slot is empty)
        {
            if (num != i + 1) // don't repeat messages (when for ex. client_1 send message to all clients, this line stop server to send same message back to client_1)
            {
                try {
                    out[i + 1].writeObject(por);
                    out[i + 1].flush();
                } catch (Exception e) {
                }
            }
        }
    }
}

public void sendUserList(String toWhom){
    for(int i = 0; i <= id; i++){
        send(findUserThread(toWhom), new ChatMessage("newuser", "SERVER", username[client[i]], toWhom));
    }
}

public int findUserThread(String usr){
    for(int i = 0; i <= id; i++){
        if(username[client[i]].equals(usr)){
            return client[i];
        }

    }
    return -1;
}

  private int findClient(int num){  
    for (int i = 0; i <= id; i++){
        if (client[i] == (num+1)){
                return i;
            }
}
return -1;
}





public void actionPerformed(ActionEvent e) {
    if (e.getSource() == send) {
        //current time

        String s1 = textMessage.getText();
        send(client[id], new ChatMessage("message", "admin", s1, "client"));
        chatArea.append("Administrator: " + s1 + "\n");


    } else if (e.getSource() == start) {
        Start();
    }
    if (e.getSource() == disconnect) {

        try {
            server.close();
        } catch (Exception ex) {
        }

        for (int i = 0; i < client.length; i++) {
            try {
                in[i].close();
                out[i].close();
            } catch (Exception ex) {
            }
        }
        chatArea.append("Server is disconnected\n");
        start.setEnabled(true);
        disconnect.setEnabled(false);
    }
}
}
