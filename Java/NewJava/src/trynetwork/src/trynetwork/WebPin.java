package trynetwork;

import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;

public class WebPin {
	public static void main (String args[]) throws UnknownHostException, IOException{
		
		InetAddress add=null;
		
		Socket sock=new Socket("www.google.com",80);
		add=sock.getInetAddress();
		System.out.println("conncetion to" +add);
		sock.close();
	}

}
