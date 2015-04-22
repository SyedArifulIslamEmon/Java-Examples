import java.io.IOException;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;

//import org.omg.CORBA.PRIVATE_MEMBER;


public class ServersokCon {
	public static void main (String args[]) throws IOException{
		
		ServerSocket serverSocket=new ServerSocket(6123);
		while (true){
			
			System.out.println("lising------->");
			
			Socket socket=serverSocket.accept();
			
			InetAddress address=socket.getInetAddress();
			
			System.out.println("name ----->"+address.getHostName()+"\n address--->"+address.getHostAddress());
			
			pause(500);
			socket.close();
			
		}
	
		
		
	}

	private static void pause(int i) {
		// TODO Auto-generated method stub
		try {
			Thread.sleep(i);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
