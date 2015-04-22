
import java.io.*;
import java.net.*;

public class Client {
	
	public static final int PORT = 4890;
	
	public static void main(String[] args) {
		new Client();
	}
	
	BufferedReader cmd_reader;
	
	public Client() {
		try {
			InputStream is = System.in;
			InputStreamReader isr = new InputStreamReader(is);
			cmd_reader = new BufferedReader(isr);
			
			System.out.println("Uploader 1.0 beta By Glen Chatfield.");
			
			System.out.print("IP Address: ");
			String address = cmd_reader.readLine();
			
			System.out.print("FileName: ");
			String file_name = cmd_reader.readLine();
			
			File file = new File(file_name);
			if(!file.exists()) {
				System.out.println("Error: File \"" + file_name + "\" does not exist.");
			}
			long size = file.length();
			
			System.out.println("Connecting... Please Wait");
			InetAddress ip = InetAddress.getByName(address);
			Socket server = new Socket();
			try {
				server = new Socket(ip, PORT);
			} catch(Exception e) {
				System.out.println("The upload server is not running on " + address + ".");
				Thread.sleep(2500);
				System.exit(0);
			}
			
			System.out.println("Connection Accepted.");
			System.out.println("Uploading File...");
			
			OutputStream os = server.getOutputStream();
			OutputStreamWriter osw = new OutputStreamWriter(os);
			PrintWriter pw = new PrintWriter(osw);
			
			pw.println(file_name);
			pw.flush();
			
			pw.println(size + "");
			pw.flush();
			
			FileInputStream fos = new FileInputStream(file);
			
			System.out.print("0%");
			int old = 0;
			int change = 0;
			int n_change = 0;
			for(long i = 0;i < size;i++) {
				os.write(fos.read());
				double t_percent = (double) ((double) i / (double) size * (double) 100);
				int percent = (int) t_percent;
				if(percent != old) {
					change++;
					n_change++;
					old = percent;
					if(n_change == 10) {
						System.out.print(percent + "%");
						n_change = 0;
						change = 0;
					}
					if(change == 2) {
						change = 0;
						System.out.print(".");
					}
				}
			}
			System.out.println("100%");
			os.close();
			osw.close();
			pw.close();
			server.close();
		} catch(Exception e) {
			e.printStackTrace();
			System.out.println("Unfortunately there was an error :(");
		}
	}
}
