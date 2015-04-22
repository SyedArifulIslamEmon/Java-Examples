package trynetwork;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class GetIp {
	public static void main (String args[]) throws UnknownHostException{
		
		InetAddress add=null;
		add=InetAddress.getByName("www.facebook.com");
		System.out.println(add.getHostName()+"="+add.getHostAddress());
		
	}

}
