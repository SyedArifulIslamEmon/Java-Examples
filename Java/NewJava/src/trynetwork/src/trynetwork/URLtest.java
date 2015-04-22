package trynetwork;

import java.net.InetAddress;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.UnknownHostException;

public class URLtest {
	public static void main (String args[]) throws MalformedURLException, UnknownHostException{
		
		URL url =new URL("http://www.server.com");
		
		System.out.println("URL name--->"+url.toString());
		
		System.out.println("protocl---->"+url.getProtocol());
		System.out.println("file------->"+url.getFile());
		System.out.println("p0rt-------->"+url.getPort());
		System.out.println("Dafult port------->"+url.getDefaultPort());
		InetAddress address=InetAddress.getByName(url.getHost());
		System.out.println("Ip------------>"+address.getHostAddress());
		
	}

}
