package trynetwork;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class getlocalHosts {
	
	public static void main (String args[]) throws UnknownHostException{
		
	InetAddress address=InetAddress.getLocalHost();
	
	
	System.out.println("locla address----->"+address.getHostAddress());
	System.out.println("local host name----->"+address.getHostName());	
		
	}

}
