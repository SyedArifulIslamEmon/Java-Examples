package trynetwork;

import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;

public class WebPintry {
	public static void main (String args[]){
		
		InetAddress I=null;
		try {
			Socket s=new Socket("www.google.com",80);
			I=s.getInetAddress();
			System.out.println(I);
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
	}

}
