import java.net.InetAddress;
import java.net.UnknownHostException;


public class InetAddressTest {
	public static void main (String args[]) throws UnknownHostException{
		
		
		
		InetAddress n=InetAddress.getByName("www.facebook.com");
		
		System.out.println(n);
		n=InetAddress.getLocalHost();
		System.out.println(n);
		
		InetAddress A[]=InetAddress.getAllByName("www.facebook.com");
		for(int i=0;i<A.length;i++){
			
			System.out.println(A[i]);
		}
	}

}
