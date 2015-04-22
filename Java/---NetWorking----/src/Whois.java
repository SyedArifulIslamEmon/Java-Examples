import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;


public class Whois {
	public static void main (String args[]) throws UnknownHostException, IOException{
		
		int c;
		
		Socket socket=new Socket("internic.net",43);
		
		InputStream in=socket.getInputStream();
		
		OutputStream out= socket.getOutputStream();
		
		String string=(args.length==0? "osborne.com" : args[0])+"\n";
		byte b[]=string.getBytes();
		
		out.write(b);
		
		while((c=in.read())!=-1){
			
			System.out.println((char)c);
		}
		socket.close();
		
	}

}
