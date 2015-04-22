package trynetwork;

import java.io.IOException;
/////import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

public class websize {
	public static void main (String args[]) throws Exception{
		int size;
		URL n=new URL("http://www.mygamma.com");
		
		URLConnection con=n.openConnection();
		
		size=con.getContentLength();
		if(size<0)
			
			System.out.println("not");
		
		else
			
			System.out.println(size);
		
		con.getInputStream().close();
	}

}
