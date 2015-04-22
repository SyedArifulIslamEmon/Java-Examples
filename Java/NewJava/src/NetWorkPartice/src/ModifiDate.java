import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;


public class ModifiDate {
	public static void main (String args[]) throws IOException{
		
		URL url=new URL("http://www.tutorialspoint.com/");
		
		URLConnection connection=url.openConnection();
		
		connection.setUseCaches(false);
		
		
		long i=connection.getLastModified();
		System.out.println(i);
		
		
		
	}

}
