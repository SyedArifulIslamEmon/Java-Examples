
import java.io.*;
import java.net.*;
import java.util.Vector;

public class Server implements Runnable {
	
	public static final int PORT = 4890;
	
	public static void main(String[] args) {
		new Server();
	}
	
	public Server() {
		new Thread(this).start();
	}
	
	public void run() {
		try {
			ServerSocket server = new ServerSocket(PORT);
			while(true) {
				runReturn(server);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void runReturn(ServerSocket server) throws Exception {
		Socket client = server.accept();
		
		InputStream is = client.getInputStream();
		InputStreamReader isr = new InputStreamReader(is);
		BufferedReader br = new BufferedReader(isr);
		
		/*OutputStream os = client.getOutputStream();
		OutputStreamWriter osw = new OutputStreamWriter(os);
		PrintWriter pw = new PrintWriter(osw);*/
		
		
	}
}

