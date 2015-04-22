import java.net.MalformedURLException;
import java.net.URL;


public class UrlDemo {

	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub
		
		
		URL hp=new URL("https://www.facebook.com/groups/java.for.life/");
		
		
		System.out.println("protocol:----->"+hp.getProtocol());
		System.out.println("Port--------->"+hp.getPort());
		System.out.println("Host-------->"+hp.getHost());
		
		System.out.println("File-------->"+hp.getFile());
		
		System.out.println("Exit-------->"+hp.toExternalForm());

	}

}
