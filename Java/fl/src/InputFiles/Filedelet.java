package InputFiles;

import java.io.File;

public class Filedelet {
	public static void main (String args[]){
		
		  boolean success = (new File("C:/Users/User/Desktop/s.txt")).delete();
		if(success){
			
			System.out.println("delet succeessfully");
		}
		
	}

}
