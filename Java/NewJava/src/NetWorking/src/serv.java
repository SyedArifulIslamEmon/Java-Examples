
import java.net.*;
import java.io.*;

class serv implements Runnable
{
	Thread t;
	Socket client;
	serv(Socket client)
	{
		this.client=client;
		t=new Thread(this);
		t.start();	
	}
	public void run()
	{
		try
		{
			BufferedReader br=new BufferedReader(new InputStreamReader(client.getInputStream()));
			while(true)
			{
				String st1=br.readLine();
				System.out.println("client: "+st1);
			}
		}
		catch(IOException e)
		{
			System.out.println(e);

		}	
	}
}

class serverchat 
{
public static void main(String args[]) throws IOException 
{
	
	ServerSocket server=new ServerSocket(1300);
	System.out.println("waiting for request from peer.....");
	Socket client=server.accept();
	serv s=new serv(client);
	System.out.println("request accepted");
	BufferedReader br2=new BufferedReader(new InputStreamReader(System.in));
	PrintStream ps2=new PrintStream(client.getOutputStream());
   	while(true)
	{
		String st=br2.readLine();
		ps2.println(st);
		}
	}   
}
