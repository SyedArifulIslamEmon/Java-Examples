package trynetwork;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Date;

import org.omg.CORBA.PUBLIC_MEMBER;

public class ConectDate {
	public static void main (String args[]) throws IOException{
		
		URL n=new URL("http://www.facebook.com");
		
		HttpURLConnection urlcon=(HttpURLConnection)n.openConnection();
		long date=urlcon.getDate();
		if(date==0){
			
			System.out.println("-----not find date------ ");
			
		}
		else{
			
			System.out.println("date is --->"+new Date(date));
		}
		
	}

}
