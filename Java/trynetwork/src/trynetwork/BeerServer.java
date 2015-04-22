package trynetwork;

import java.io.IOException;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;

public class BeerServer {
	public static void main (String args[]) throws IOException{
		
		ServerSocket ssock=new ServerSocket(1234);
		System.out.println("lisining");
		Socket sock=ssock.accept();
		PrintStream p=new PrintStream(sock.getOutputStream());
		
		for(int i=0;i<=10;i++){
			p.println(i+"form java source and support");
			
			
			
		}
		p.close();
		sock.close();
		
		
	}

}
