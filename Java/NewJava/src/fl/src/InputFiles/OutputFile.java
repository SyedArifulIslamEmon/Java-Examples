package InputFiles;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Formatter;

public class OutputFile {
	public static void main (String args[]) throws FileNotFoundException{
		
		System.out.println("How to save data in File");
		
		int i=35;
		String s="sudip";
		double d=356.545;
		char c='S';
		
		Formatter f=new Formatter(new File("C:/Users/User/Desktop/Fuck.txt"));
		
		f.format(s);
		f.format(" ");
		f.format("%d",i);
		
		f.close();
		
		
		
		
		
		
	}

}
