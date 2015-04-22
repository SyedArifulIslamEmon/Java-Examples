package InputFiles;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintStream;

public class Appendss1 {
	public static void main (String args[]){
		
		try
		{
		   
		    FileWriter fw = new FileWriter("C:/Users/User/Desktop/S.txt",true); 
		  fw.write("\n\r\n\r");
		   
		   
		    fw.write("add a line\n");
		    
//		    PrintStream fileStream = new PrintStream(new File("C:/Users/User/Desktop/S.txt"));
//		    fileStream.println("your data");
//		    
		    
		    fw.close();
		}
		catch(IOException ioe)
		{
		    System.err.println("IOException: " + ioe.getMessage());
		}
		
		
		
	}

}
