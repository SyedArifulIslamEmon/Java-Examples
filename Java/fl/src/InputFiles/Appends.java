package InputFiles;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Appends {
	public static void main (String args[]){
		
		try(PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("C:/Users/User/Desktop/S.txt", true)))) {
		    out.println("the text");
		}catch (IOException e) {
		    //exception handling left as an exercise for the reader
		}
		
		
	}

}
