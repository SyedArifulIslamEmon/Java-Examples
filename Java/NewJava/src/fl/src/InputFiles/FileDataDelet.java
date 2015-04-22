package InputFiles;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class FileDataDelet {
	public static void main (String args[]) throws FileNotFoundException{
		
		
		
		PrintWriter writer = new PrintWriter("C:/Users/User/Desktop/S.txt");
		writer.print("");
		writer.close();
	}

}
