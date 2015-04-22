import java.net.InetAddress;
import java.net.URL;
import java.net.UnknownHostException;


public class getloc {
      public static void main (String args[]) throws UnknownHostException{
    	  
    	InetAddress address=InetAddress.getLocalHost();
    	InetAddress address2=InetAddress.getByName("74.125.67.100");
    	
    	System.out.println("add"+address.getHostAddress()+"\n Ip-->"+address.getHostName());
    	  
    	  System.out.println("name----->"+address2.getHostName());
    	  System.out.println("\nIp--->"+address2.getHostAddress());
      }
}
