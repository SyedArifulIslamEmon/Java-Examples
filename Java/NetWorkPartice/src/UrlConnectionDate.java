import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.Date;


public class UrlConnectionDate {
	public static void main (String args[]) throws IOException{
		
		URL url=new URL("http://www.google.com");
		
		URLConnection connection=(URLConnection)url.openConnection();
		
		long i=connection.getDate();
		if(i==0){
			
			System.out.println("-------Can not find date----- ");
			
		}
		else{
			
			
			System.out.println(new Date(i));
		}
		
		
	}

}
