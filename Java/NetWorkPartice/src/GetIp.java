import java.net.InetAddress;
import java.net.UnknownHostException;


public class GetIp {
	public static void main (String args[]) throws UnknownHostException{
		
		InetAddress  add= InetAddress.getByName("www.facebook.com");
		
		System.out.println("Name--------->"+add.getHostName()+"\n Ip------->"+add.getHostAddress());
		
	}

}
