package manp;

//****** SERVER CODE ENDS*************////////////////

import java.net.*;
import java.io.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

////////************* Main Class **************
class S_CHAT
{
 public static int CPort, S_Client_No,DPort;

                public static void main(String[] arg){
                                 System.out.println("Initializing Chatting Server...");
                                 System.out.println("Default binding port no : 2000.");
                                 System.out.println("Maximum 15 users can log at a time.");
                                 MainFrame MF= new MainFrame();
                                 MF.show();
                }

}
////////************* Main Class Ends **************

////////************* Client info Class **************
class CLIENT_INFO
{
                String Cli_name;
                Socket Cli_Cmd;//Cli_Data;


                CLIENT_INFO(String s, Socket C)
                {
                                 Cli_name=s;
                                 Cli_Cmd=C;
                                 //Cli_Data=D;
                }

}
////////************* Client info Class Ends **************

////////************* Servers Gui Class **************
class MainFrame extends Frame implements ActionListener
{
                JLabel l,ul;
                JTextField P,B_M;
                public static JButton S,CW,Broad;
                public static CLIENT_INFO C_INFO[]=new CLIENT_INFO[15];
                public static List UL;
                public static TextArea T;
				protected static Object c_s;

                MainFrame()
                {
                                 super("MadMan Chatting Server");
                                 setSize(500,550);
                                 setLayout(null);
                                 addWindowListener(new WindowAdapter ()
                                 {public void windowClosing (WindowEvent e) { System.exit(0); } } );

                                 l=new JLabel("Listen at Port:");
                                 add(l);
                                 l.setBounds(10,30,100,20);

                                 P=new JTextField("2000");
                                 add(P);
                                 P.setBounds(120,30,60,20);

                                 S=new JButton("Start");
                                 add(S);
                                 S.setBounds(200,28,80,25);
                                 S.addActionListener(this);

                                 T=new TextArea("MadMan Chatting Server...STARTED",25,50,1);
                                 add(T);
                                 T.setBounds(10,60,350,440);
                                 T.setEditable(false);

                                 ul = new JLabel("On Line Users");
                                 add(ul);
                                 ul.setBounds(370,60,120,20);

                                 UL=new List(25);
                                 add(UL);
                                 UL.setBounds(370,80,120,390);

                                 B_M=new JTextField("Server Broadcast Message.");
                                 add(B_M);
                                 B_M.setBounds(10,515,350,20);

                                 Broad=new JButton("Broadcast Msg.");
                                 add(Broad);
                                 Broad.setBounds(370,512,120,25);
                                 Broad.addActionListener(this);

                                 CW=new JButton("Message To...");
                                 add(CW);
                                 CW.setBounds(370,475,120,25);
                                 CW.setVisible(false);
                                  CW.addActionListener(this);

                }

                public void actionPerformed(ActionEvent AE)
                {
                                 if(AE.getSource()==S)
                                    {
                                                     UL.addItem("[MAD_MAN]");
                                                  C_INFO[0]=new CLIENT_INFO("[MAD_MAN]",null);
                                                     try
                                                     {
                                                     S_CHAT.CPort=Integer.parseInt(P.getText());
                                    }catch(Exception E){}
                                    S_CHAT.DPort=S_CHAT.CPort+1000;

                                                     new THBind(S_CHAT.CPort);

                                                     if(UL.getItemCount()>0)
                                                      CW.setVisible(true);
                                    }
                                 if(AE.getSource()==CW)
                                 {
                                                  String msg=JOptionPane.showInputDialog("Enter the Message:");
                                                  if(!(msg==null))
                                                   if(!(UL.getSelectedItem()==null))
                                                   {
                                                                    System.out.println("Message : "+msg+" to : "+UL.getSelectedIndex());
                                                                    send_msg(msg,UL.getSelectedIndex());
                                                   }
                                                   else
                                                    JOptionPane.showMessageDialog(this,"No Client Selected","Alert",
                                                                                                                                                          JOptionPane.INFORMATION_MESSAGE);
                                 }
                                 if(AE.getSource()==Broad)
                                 {
                                                  for(int t=0;t<UL.getItemCount();t++)
                                                   send_msg("BROADCAST : "+B_M.getText(),t);

                                 }
                }

public void send_msg(String m,int TO)
{
                 PrintWriter o;
    if(TO>0)
    {
                 try
                                 {
                                  o = new
PrintWriter(MainFrame.C_INFO[TO].Cli_Cmd.getOutputStream(),true);
                                  o.println("S_MSG");
                                  o.println(m);

                                 }
                                 catch(Exception E){}
                }
                else
                 JOptionPane.showMessageDialog(this,m,"Server Message",
                                                                                                                                                          JOptionPane.INFORMATION_MESSAGE);

}

}
////////************* Servers Gui Class Ends **************

////////************* Connection Handling (Thread) Class **************
class THBind extends Frame implements Runnable
{

Thread BT;
int dport,cport;
static int i=1;
static ServerSocket server_CSocket,server_DSocket;

public THBind(int cp)
{
 BT=new Thread(this);
 cport=cp;

 dport=S_CHAT.DPort;
 BT.start();

}

public void run()
   {
                    MainFrame.S.setVisible(false);
                    if (cport<1024)
                     {
                                     System.out.println("Server Binded to port = 2000 (default)");
                                     cport = 2000;
                                     dport=3000;
                                     S_CHAT.DPort=3000;
        }
                    else
                    {
                     try {
                       server_CSocket = new ServerSocket(cport);
                       server_DSocket = new ServerSocket(dport);

                     MainFrame.T.append("
Server waiting for client on port " +
                       server_CSocket.getLocalPort());

                     while(i<15) {
                       Socket CSocket = server_CSocket.accept();

                       MainFrame.T.append("
New connection accepted " +
CSocket.getInetAddress() + ":" +                  CSocket.getPort());
                       new Client_P(CSocket,i);
                       i++;
                       } //while
                      } //try

                     catch (IOException e) {
                    System.out.println(e);
          }
                    }
                }//bind

} //class THBind
////////************* Connection Handling (Thread) Class Ends
**************

////////************* Client Handling (Thread) Class **************
class Client_P extends Frame implements Runnable
{
Thread t;
int ci;
private Socket c_s;
String uname="Anonymous",pass;

BufferedReader C_input;
PrintWriter C_output;


PrintWriter r=null,a=null;
BufferedReader r1=null,a1=null;

public Client_P(Socket C,int i)
{
t=new Thread(this);
c_s = C;
ci=i;
t.start();
}
public void run()
{
                int check=login();

                 while(check!=1)
                  check=login();

                 if (check==1)
                 {

                                                   System.out.println("OK...");
                                                   C_output.println("U_E");


                                                   MainFrame.C_INFO[ci]=new CLIENT_INFO(uname,c_s);
                                                   MainFrame.UL.addItem(uname);
                                                   MainFrame.T.append("
"+MainFrame.C_INFO[ci].Cli_name);
                                                   MainFrame.T.append("
"+MainFrame.C_INFO[ci].Cli_Cmd);


                                                   System.out.println("Broadcasting List...");
                                                   BROADCAST_LIST();
                                                   System.out.println(" List BroadCasted");
                                                   System.out.println("Reading Clients");
                                                   System.out.println(THBind.i);
                                                   int i=1;
                                                   try
                                                   {
                                                   while(i==1)
                                                   {
                                                                    String l=C_input.readLine();
                                                                    i=Manipulate(l);
                                                                    if(i==2)
                                                                    {
                                                                                     System.out.println("Enterting MSG_READER thread");
                                       new MSG_RDR(r1,a);
                                       new MSG_RDR(a1,r);
                                                                                     System.out.println("Enterting MSG_READER thread done sucessfully");
                                                                                     i=1;
                                                                    }

                                                   }

                                      }
                                      catch(IOException E)
                                      { System.out.println("Error in Reading Client Request");}

                                      MainFrame.T.append("
User Logged Out : "+uname);
                                      CLIENT_INFO tmp[]=new CLIENT_INFO[15];
                                       int j=0;
                                      for(int x=0;x<THBind.i;x++)
                                      {
                                                       if(!uname.equals(MainFrame.C_INFO[x].Cli_name))
                                                       {
                                                                        tmp[j]=MainFrame.C_INFO[x];
                                                                        System.out.println(tmp[j].Cli_name);
                                                                        j++;
                                                       }

                                      }
                                      THBind.i--;
                                      System.out.println(THBind.i);
                                      MainFrame.C_INFO=new CLIENT_INFO[15];
                                      MainFrame.UL.removeAll();
                                      System.out.println("Modifying Client Info Array");
                                       for(int x=0;x<j;x++)
                                       {
                                        MainFrame.C_INFO[x]=tmp[x];
                                        MainFrame.UL.addItem(tmp[x].Cli_name);
                                       }

                                      BROADCAST_LIST();



}
else
{
                System.out.println("User Already Exist");
                //run();
}

}

void BROADCAST_LIST()
{
                PrintWriter o;
                for(int j=1;j<THBind.i;j++)
                {
                 try
                                 {
                                  o = new
PrintWriter(MainFrame.C_INFO[j].Cli_Cmd.getOutputStream(),true);


                                 o.println("ULIST");

                                 for(int x=0;x<MainFrame.UL.getItemCount();x++)
                                  o.println(MainFrame.UL.getItem(x));

                                 o.println("END");
                                 }
                                 catch(Exception E){}
                }

}/// BRAODCAST_LIST

int Manipulate(String CMD)
{
                if(CMD.equals("LOGOUT"))
                 return 0;
                if(CMD.equals("RQT_CHAT"))
                {
                                 try
                                                   {
                                                                    String u=C_input.readLine();
                                                                    String f=C_input.readLine();
                                                                    System.out.println("Waiting for Requestor");
                                                                    Socket Friend_Cmd=null;
                                                                    Socket d_s1=THBind.server_DSocket.accept();
                                                                    for(int j=0;j<MainFrame.UL.getItemCount();j++)
                                                                     if(f.equals(MainFrame.C_INFO[j].Cli_name))
                                                                      {
                                                                                       Friend_Cmd=MainFrame.C_INFO[j].Cli_Cmd;
                                                                                       break;
                                                                      }

                                                                     try
                                                                     {
                                                                                      PrintWriter Fo=new PrintWriter(Friend_Cmd.getOutputStream(),true);
                                                                                      Fo.println("CALL_CHAT");
                                                                                     Fo.println(f);
                                                                                     Fo.println(u);
                                                                                     System.out.println("Information Transfered to Acceptor");
                                                                     }
                                                                     catch(Exception E){}

                                                                    System.out.println("Waiting for Acceptor");
                                                                    Socket d_s2=THBind.server_DSocket.accept();
                                                                    System.out.println("Connection for Acceptor Done");
                                                                    System.out.println(d_s2);
                                                                    COM_PROCESS(d_s1,d_s2);
                                                                    System.out.println("COM_PROCESS Done here.");

                                                   }

                                                   catch(IOException E)
                                      { System.out.println("Reading Chatting Request");}
                                      return 2;

                }
                else
                 return 1;
}/// Manipulate

public void COM_PROCESS(Socket rqt, Socket accp)
                {

                try
                                                   {

                                                                    r=new PrintWriter(rqt.getOutputStream(),true);
                                                                    a=new PrintWriter(accp.getOutputStream(),true);

                                                                    r1=new BufferedReader(new InputStreamReader(rqt.getInputStream()));
                                                                    a1=new BufferedReader(new InputStreamReader(accp.getInputStream()));
                                                       System.out.println("Streams Created");
                                                   }
                                                   catch(Exception E)                  {}

}

boolean already_exist()
{
                System.out.println("index :"+ ci);
                if(ci!=0)
                for(int j=0;j<ci;j++)
                {
                 if(MainFrame.C_INFO[j].Cli_name.equals(uname))
                  return true;
                 else
                  continue;
   }

  return false;
}

public int login()
{
       int FOUND=0,flag=0;
       String cmd="S_U";

try {
C_input = new BufferedReader(new
InputStreamReader(c_s.getInputStream()));
C_output = new PrintWriter(c_s.getOutputStream(),true);


                     cmd=C_input.readLine();
                     uname=C_input.readLine();
                     pass=C_input.readLine();
                     MainFrame.T.append("
Authenticating user -
"+uname);




DataInputStream fin = new DataInputStream(new
FileInputStream("data.txt"));
            while(true)
             {
              if( uname.equals(fin.readUTF()) )
               {
                flag = 1;
                if( pass.equals(fin.readUTF()) )
                 {
                  FOUND=1;
                  break;
                 } // if( ps.equals(fin.readUTF()) )
                else
                 {
                  FOUND=0;
                  //C_output.println("NACK");
                  break;
                 }//else
                }//if( nm.equals(fin.readUTF()) )
              }//while
     }//try
            catch(Exception e1) { }



     System.out.println("CMD: "+cmd+"  flag="+flag);
    if(cmd.equals("N_U") && flag==0)
     {
                      try
                      {
                      DataOutputStream fout = new DataOutputStream(new
FileOutputStream("data.txt",true));
                      fout.writeUTF(uname);
                      fout.writeUTF(pass);
                      fout.close();
                      System.out.println("User Wrote in File");
                      C_output.println("User Signed Sucessful");
     }catch(Exception E){};

     }
     else
      {
                       if(flag==1&&FOUND==0&&cmd.equals("N_U"))
          C_output.println("User Exist Sign-in other.");
       else
         {
         if (FOUND==0&&cmd.equals("S_U"))
                           C_output.println("NACK");
                        else
                        {
                                         if(FOUND==1&&already_exist()==false)
                                      {
                                                       MainFrame.T.append("
User ""+uname+"" Authenticated");
                                                       C_output.println(S_CHAT.DPort);
                                      }
                                      else
                                      {
                                                     FOUND=0;
                                                     C_output.println("U_A_E");
                                                  }
                        }
                        }

      }


   return (FOUND);
}

}
////////************* Client Handling (Thread) Class Ends **************


////////************* Message Transfering (Thread) Class **************
class MSG_RDR extends Frame implements Runnable
{
                Thread t;
                BufferedReader BR;
                PrintWriter PW;

   public MSG_RDR(BufferedReader br, PrintWriter pw)
                {
                                 t=new Thread(this);
               System.out.println("I am Inside MSG_RDR");
                                 BR=br;
                                 PW=pw;
                                 PW.println("Stream established For Communication...");
                                 MainFrame.T.append("
Indise The MESSAGE READER Thread");
                                 t.start();

                }
                public void run()
                {
                                 while(true)
                                 {
                                                  try
                                                  {
                                                                   String s= BR.readLine();
                                                                   PW.println(s);
                                                  }
                                                  catch(IOException E){}
                                 }
                }
}
////////************* Message Transfering (Thread) Class Ends
**************

//////////************ SERVER CODE ENDS*************////////////////








////********** CLIENT CODE STARTS ******************//////////
import java.io.*;
import java.awt.*;
import java.net.*;
import javax.swing.*;
import java.awt.event.*;

////////************* MAIN CLASS ***********
class S_Client
   {

   public static void main(String args[])
       { 
        MainFrame frm = new MainFrame();
       frm.setResizable(false);
       frm.show();
       }
   }
////////************* MAIN CLASS Ends ***********

////////************* Connection Frame Class ***********
class MainFrame extends Frame implements ActionListener
{
                TextField t1,t2;
   Label l1,l2,l3,St;
   Button b1;
   static Socket c_s;
   static String serv="localhost";
   int flag = 0;
   String nm,ps;
   public MainFrame()
       {
                        super("Connection To...");
       setSize(250,150);
       setLayout(null);
       addWindowListener(new WindowAdapter ()
                     {
                                      public void windowClosing (WindowEvent e)
                                      {
                                                       System.exit(0);
                                      }
                     } );

       add(l1=new Label("Server IP:"));
       l1.setBounds(20,40,80,20);
       add(t1 = new TextField(10));
       t1.setBounds(110,40,80,20);
       add(l2=new Label("Port:"));
       l2.setBounds(20,70,80,20);
       add(t2 = new TextField("2000"));
       t2.setBounds(110,70,80,20);
       add(b1 = new Button("Connect"));
       b1.setBounds(130,100,60,20);
       add(l3=new Label("Status"));
       l3.setBounds(10,125,200,20);
       St=new Label("");
       St.setBounds(60,125,190,20);
       add(St);

       b1.addActionListener(this);

       }

   public void actionPerformed(ActionEvent ae)

       {
                        if(ae.getSource()==b1)
                        {
                                         if(t2.getText().equals(""))
                                                          l3.setText("Port No. meust be entered.");
                                         else
                                             CONNECT_TO();
                        }
       }

   public void CONNECT_TO()
   {
                    int port=2000;


                    if(t1.getText()=="")
                         serv="localhost";
       else
                         serv=t1.getText();

                    try
       {
                        port = Integer.parseInt(t2.getText());

       }
                        catch (Exception e) { }

                    try
                                                  {
                                                                   c_s = new Socket(serv, port);
                                                                   l3.setText("Connected to server " +c_s.getInetAddress()+":" +
c_s.getPort());
                                                                   form F=new form();
                                                                   F.show();
                                                                   F.setResizable(false);
                                                                   this.hide();
                                                  }
                                                  catch (UnknownHostException e)
                                                  {
                                                                   System.out.println(e);
                                                                   System.out.println("Error in connecting Server");
                                                                   //System.exit(ERROR);
                                                  }
                                                  catch (IOException e)
                                                  {
                                                                   System.out.println(e);
                                                                   System.out.println("Error in connecting Server");
                                                                   //System.exit(ERROR);
                                                  }
   }

}

////////************* Connection Frame Class Ends ***********

////////************* Login Frame Class ***********
class form extends Frame implements ActionListener
   {
   static TextField t1,t2;
   Label l1,l2,l3,St;
   Button b1,b2;

   static BufferedReader C_input;
   static PrintWriter C_output;

   int flag = 0;
   static int po;
   String nm,ps;
   public form()
       {
                        super("Login to MadMan Chatting Server");
       setSize(250,150);
       setLayout(null);

       addWindowListener(new WindowAdapter ()
                     {
                                      public void windowClosing (WindowEvent e)
                                      {
                                                       System.exit(0);
                                      }
                     } );

                     try
                     {
                                      C_input = new BufferedReader(new
InputStreamReader(MainFrame.c_s.getInputStream()));
                                      C_output = new PrintWriter(MainFrame.c_s.getOutputStream(),true);
                     }
                     catch(Exception E){}

       add(l1=new Label("Username:"));
       l1.setBounds(20,40,80,20);
       add(t1 = new TextField(10));
       t1.setBounds(110,40,80,20);
       add(l2=new Label("Password:"));
       l2.setBounds(20,70,80,20);
       add(t2 = new TextField(10));
       t2.setBounds(110,70,80,20);
       add(b1 = new Button("LOGIN"));
       b1.setBounds(140,100,50,20);
       add(b2 = new Button("Sign Up..."));
       b2.setBounds(70,100,60,20);
       add(l3=new Label("Report:"));
       l3.setBounds(10,125,200,20);
       St=new Label("");
       St.setBounds(60,125,190,20);
       add(St);

       t2.setEchoChar('*');


       b1.addActionListener(this);
       b2.addActionListener(this);

       }

   public void actionPerformed(ActionEvent ae)

       {
                        po=3000;
                        String l="";
       if(ae.getSource()==b2)
       {
                        Sign_UP Su = new Sign_UP();
                        Su.show();
                        t1.setText("");
                        t2.setText("");
       }

       if(ae.getSource() == b1)
       {
                        C_output.println("S_U");
                        C_output.println(t1.getText());
                        C_output.println(t2.getText());
                        try
                        {
                         l=C_input.readLine();
                           System.out.println(l);
           }
           catch(IOException E){}
                        if(!l.equals("NACK"))
                        {

                                          if(l.equals("U_A_E"))
                                           {
                                                            l3.setText("User Alreal Exist");
                                                            System.out.println("User Alreal Exist");
                                                            t1.setText("");
                                                            t2.setText("");
                                           }
                                         else
                                         {

                                         try
                                         {
                                                          po=Integer.parseInt(l);
                                         }
                                         catch(Exception E){}
                                         try
                                         {
                                                          System.out.println("Waiting for other cmd");
                                                          l=C_input.readLine();
                                                          System.out.println(l);
                                                          System.out.println("CMD Recieved");
                                         }
           catch(IOException E){}

                                                          Frame3 F3=new Frame3(t1.getText());
                                                          F3.show();
                                                          F3.setResizable(false);
                                                          this.hide();


                                                  }
                        }
                        else
                         l3.setText("Invalid Username/Password.");
       }

       //System.out.println("Loggin in Again");
       }

  } //Form
////////************* Login Frame Class Ends ***********

////////************* New User Sign Up Frame Class ***********
class Sign_UP extends Frame implements ActionListener
   {
   TextField tt1,tt2,tt3;
   Label l1,l2,l3,l4;
   Button b1;

   public Sign_UP()
       {
       super("New User to MadMan Chatting Server");
       setSize(250,180);
       setLayout(null);

       addWindowListener(new WindowAdapter ()
                     {
                                      public void windowClosing (WindowEvent e)
                                      {
                                                       dispose();
                                      }
                     } );
                     add(l1=new Label("Username:"));
       l1.setBounds(20,40,80,20);
       add(tt1 = new TextField(10));
       tt1.setBounds(110,40,80,20);
       add(l2=new Label("Password:"));
       l2.setBounds(20,70,80,20);
       add(tt2 = new TextField(10));
       tt2.setBounds(110,70,80,20);
       add(l4=new Label("Confirm Pass."));
       l4.setBounds(20,100,80,20);
       add(tt3 = new TextField(10));
       tt3.setBounds(110,100,80,20);
       add(b1 = new Button("Sign In"));
       b1.setBounds(130,130,60,20);
       b1.addActionListener(this);
       add(l3=new Label("Report:"));
       l3.setBounds(10,155,200,20);
       tt2.setEchoChar('-');
       tt3.setEchoChar('-');

                }
                public void actionPerformed(ActionEvent AE)
                {

if(tt1.getText().equals("")||tt2.getText().equals("")||tt3.getText().equals(""))
         l3.setText("Text Field(s) Empty.");
                                 else
                                  {
                                                   if(tt3.getText().equals(tt2.getText()))
                                                   {
                                                                    form.C_output.println("N_U");
                                                                    form.C_output.println(tt1.getText());
                                                                    form.C_output.println(tt2.getText());
                                                                    try{
                                                                    String s = form.C_input.readLine();
                                                                    l3.setText(s);


                                                   }catch(IOException E){}
                                                   }
                                                   else
                                                    l3.setText("Password mis-match.");

                                  }
                }
}
////////************* New User Sign Up Frame Class Ends ***********

////////************* Final Frame Class ***********
class Frame3 extends Frame implements ActionListener
{
                JLabel L,M;
                static List OUL;
                JButton B;
                String U;

                public Frame3(String u)
                {
                                 super("MadMan Client-"+u);
                                 setSize(200,410);
                                 setLayout(null);
                                 U=u;
                                 L=new JLabel("Hello "+U);
                                 add(L);
                                 L.setBounds(10,25,180,20);

                                 L=new JLabel("Online user list...");
                                 add(L);
                                 L.setBounds(10,45,180,20);

                                 OUL=new List(15);
                                 add(OUL);
                                 OUL.setBounds(10,70,180,320);
                                 OUL.addActionListener(this);

                                 /*B=new JButton("Chat with..");
                                 add(B);
                                 B.setBounds(30,375,140,25);
                                 */

                                 addWindowListener(new WindowAdapter ()
                     {
                                      public void windowClosing (WindowEvent e)
                                      {
                                                       try
                                                       {
                                                                        form.C_output.println("LOGOUT");
                                                                        MainFrame.c_s.close();
                                                                        System.exit(0);
                                                       }
                                          catch(IOException IE)
                                          {}

                                                       //System.exit(0);
                                      }
                     } );

                                 new CMD_L();
                }


public void actionPerformed(ActionEvent AE)
{
                 if(OUL.getSelectedItem().equals(U))
                 {
                                  JOptionPane.showMessageDialog(this,"Self-chatting is denied",
                                                            "Warning",JOptionPane.WARNING_MESSAGE);
                 }
                 else
                 {
                 if(AE.getSource()==OUL||AE.getSource()==B)
                 {

                                  if(!OUL.getSelectedItem().equals("[MAD_MAN]"))
                                  {
                                  form.C_output.println("RQT_CHAT");
                                  form.C_output.println(U);
                                  form.C_output.println(OUL.getSelectedItem());
                                  CHAT_WIN CW=new CHAT_WIN(U,OUL.getSelectedItem());
                                  CW.show();
                                  }
                                  else
                                   JOptionPane.showMessageDialog(this,"Default Server User : AccessDenied",
                                                            "Warning",JOptionPane.WARNING_MESSAGE);

   }

}
}

}
////////************* Final Frame Class Ends ***********

////////************* Chat window Frema Class **************
class CHAT_WIN extends Frame implements ActionListener,TextListener
{
                static TextArea T;
                TextField Tx;
                String uname;
                Socket d_s;
                String s;
                static BufferedReader D_input;
   static PrintWriter D_output;

public CHAT_WIN(String u,String f)
{
                 super(u+"->>> * <<<-"+f);
   setSize(400,300);
   setLayout(null);
   setResizable(false);
   uname=u;

   Tx=new TextField("");
   add(Tx);
   Tx.setBounds(10,260,380,35);
   Tx.addActionListener(this);

   T=new TextArea("CHAT WINDOW",10,50,1);
   add(T);
   T.setBounds(10,25,380,230);
   T.setEditable(false);
   T.addTextListener(this);

   try
   {
                    System.out.println("DS connection with");
                    d_s = new Socket(MainFrame.server, form.po);
       T.append("Connected to Data server " +d_s.getInetAddress()+":"+d_s.getPort());
       T.append("Establishing stream for communication...");
   }
                catch (UnknownHostException e)
                {
                                                                                    System.out.println(e);
                                                                                    System.out.println("Error in connecting Data Server");
                                                                                    //System.exit(ERROR);
                                                                   }
                                                                   catch (IOException e)
                                                                   {
                                                                                    System.out.println(e);
                                                                                    System.out.println("Error in connecting Server");
                                                                                    //System.exit(ERROR);
                                                                   }



   addWindowListener(new WindowAdapter ()
                     {
                                      public void windowClosing (WindowEvent e)
                                      {
                                                        hide();
                                      }
                     } );



   try
                 {
                  D_output=new PrintWriter(d_s.getOutputStream(),true);
                  D_input=new BufferedReader(new
InputStreamReader(d_s.getInputStream()));
   }
                 catch(IOException E){}
   new MSG_READER();
}

public void textValueChanged(TextEvent TE)
{
                 this.show();
}

public void actionPerformed(ActionEvent TE)
{
                 s=uname+" :: "+Tx.getText();
                 Tx.setText("");
                 T.append(""+s);

                  D_output.println(s);
                  System.out.println("Data Sent");



}
}
////////************* Chat window Frema Class Ends **************

////////************* Message Reader Class for Chat window **************
class MSG_READER extends Thread
{
                Thread t;
                public MSG_READER()
                {
                                 t=new Thread(this);

                                 t.start();

                }
                public void run()
                {
                                 while(true)
                                 try
                                 {
                                                  CHAT_WIN.T.append(""+CHAT_WIN.D_input.readLine());
                                 }
                                 catch(IOException E){}
                }
}
////////************* Message Reader Class for Chat window Ends
//**************

////////************* Message Reader Class reading server Msg & Commnads
//**************
class CMD_L extends Frame implements Runnable
{
                Thread t;
                String cmd="";
CMD_L()
{
                 t=new Thread(this);
                 t.start();
}

public void run()
{
                while(true)
                {
                                 try
                                 {
                                  cmd=form.C_input.readLine();
                                  compute(cmd);
                                 }
                                 catch(IOException E)
                                 {}//System.out.println("Error Reading Command At Client");}

                }
}
public void compute(String cmd)
{
                if(cmd.equals("ULIST"))
                {
                                 Frame3.OUL.removeAll();
                                 try
                                 {
                                 String s=form.C_input.readLine();

                                 while(!s.equals("END"))
                                 {
                                                  Frame3.OUL.addItem(s);
                                                  s=form.C_input.readLine();
                                 }

                                 }
                                 catch(IOException E){System.out.println("Error in Reading List byclient");
                       }
                                 }
                

                if(cmd.equals("CALL_CHAT"))
                {
                                 try
                                 {
                                 String s1=form.C_input.readLine();
                                 String s2=form.C_input.readLine();
                                 CHAT_WIN CW1=new CHAT_WIN(s1,s2);
                                 CW1.show();
                                 }
                                 catch(IOException E){System.out.println("Error in Reading List byclient");}
                }
                if(cmd.equals("S_MSG"))
                {
                                 try
                                 {
                                 String msgs=form.C_input.readLine();
                                 JOptionPane.showMessageDialog(this,msgs,
                                                            "Server Message",JOptionPane.PLAIN_MESSAGE);
                                 }
                                 catch(IOException E){System.out.println("Error in Reading List byclient");
                                 }
                                 }
                }
}


////////************* Message Reader Class reading server Msg & Commnads
//Ends**************


////********** CLIENT CODE STARTS ENDS******************//////////

