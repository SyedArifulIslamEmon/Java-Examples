package trynetwork;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class GetHostName {
	public static void main (String args[]) throws UnknownHostException{
		
		InetAddress net= InetAddress.getByName("31.13.79.49");
		
		System.out.println("address----->"+net.getHostName()+"\nIp------>"+net.getHostAddress());
		System.out.println("Add------->"+net.getHostName()+"address---->"+net.getHostAddress());

	}

}
