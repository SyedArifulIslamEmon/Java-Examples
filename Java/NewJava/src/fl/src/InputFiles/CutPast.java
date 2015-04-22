package InputFiles;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;

public class CutPast {
	public static void main (String args[])throws IOException{
		
		
		try{
			 
	    	   File afile =new File("C:/Users/User/Desktop/T.txt");
	 
	    	   if(afile.renameTo(new File("D:/Sudipd/" + afile.getName()))){
	    		System.out.println("File is moved successful!");
	    	   }else{
	    		System.out.println("File is failed to move!");
	    	   }
	 
	    	}catch(Exception e){
	    		e.printStackTrace();
	    	}

	}

}
