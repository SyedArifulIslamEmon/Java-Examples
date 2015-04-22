import java.net.InetAddress;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.UnknownHostException;


public class UrlParts {
	public static void main (String args[]) throws MalformedURLException, UnknownHostException{
		
		URL url=new URL("https://www.facebook.com/");
		
		System.out.println("URL name ----->"+url.toString());
		System.out.println("Url port------>"+url.getPort());
		System.out.println("Url default port---->"+url.getDefaultPort());
		System.out.println("URL protocol------>"+url.getProtocol());
		InetAddress address=InetAddress.getByName(url.getHost());
		System.out.println("URL ---->"+address.getHostName()+"  \n-->"+address.getHostAddress());
		System.out.println("URL get path ----->"+url.getPath());
	}

}
