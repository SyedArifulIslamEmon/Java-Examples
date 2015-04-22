package trynetwork;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

public class modifi {
	public static void main (String args[]) throws IOException{
		
		URL n=new URL("http://www.tutorialspoint.com/javaexamples/net_filetime.htm");
		URLConnection uc=n.openConnection();
		
		uc.setUseCaches(false);
		long t=uc.getLastModified();
		System.out.println(t);
		
	}

}
