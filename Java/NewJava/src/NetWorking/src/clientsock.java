

import java.net.*;
import java.io.*;

class clie implements Runnable
{
	Thread t;
	Socket client;
	clie(Socket client)
	{
		this.client=client;
		t=new Thread(this);
		t.start();
		
	}
	public void run()
	{
		try{
		
		BufferedReader br=new BufferedReader(new InputStreamReader(client.getInputStream()));
		while(true)
		{	
			String st1=br.readLine();
			System.out.println(" "+st1);
		}
		
		}
		catch(IOException e)
		{
			System.out.println(e);
		
		}	
	} 
}

class clientsock
{
public static void main(String args[]) throws IOException 
{
	try{
		System.out.println("sending request to peer....");
		Socket client=new Socket("127.0.0.1",1300);
		System.out.println("successfully conneted");
		clie c=new clie(client);
	
		BufferedReader br1=new BufferedReader(new InputStreamReader(System.in));
		PrintStream ps=new PrintStream(client.getOutputStream());
		while(true)
		{
			String s=br1.readLine();
			ps.println(s);
		}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}
