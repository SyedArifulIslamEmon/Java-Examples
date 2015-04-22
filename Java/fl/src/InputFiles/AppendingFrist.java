package InputFiles;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

public class AppendingFrist {
	public static void main (String args[]){
		
		String str = "Jennifer";  
	    byte data[] = str.getBytes();       

	    try {                           
	            RandomAccessFile f = new RandomAccessFile(new File("C:/Users/User/Desktop/S.txt"), "rw");
	            f.getChannel().position(0);         
	            f.write(data);
	            f.close();
	    } catch (IOException e) {       
	            e.printStackTrace();
	    }
		
	}

}
