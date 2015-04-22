package trynetwork;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class GetIPUseThrow {
	public static void main (String args[]){
		
		InetAddress add=null;
		
		try {
			add=InetAddress.getByName("www.facebook.com");
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.exit(2);
		}
		System.out.println(add.getHostName()+"====="+add.getHostAddress());
		System.exit(0);
	}

}
