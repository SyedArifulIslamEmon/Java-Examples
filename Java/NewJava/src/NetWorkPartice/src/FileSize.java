import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;


public class FileSize {
	public static void main (String args[]) throws IOException{
		
		URL url=new URL("http://www.tutorialspoint.com");
		
		URLConnection connection=url.openConnection();
		
		int i=connection.getContentLength();
		
		if(i<0){
			System.out.println("do not determine file size ");
		}
		
		else{
		System.out.println("file size----------->"+i/1024);
		}
		
		
	}

}
