import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;


public class Connected {
	public static void main (String args[]) throws UnknownHostException, IOException{
		
		InetAddress address;
		Socket socket=new Socket("www.facebook.com",80);
		
		address=socket.getInetAddress();
		System.out.println("connect to----->"+address);
		socket.close();
	}

}
