package InputFiles;

import java.io.*;

public class FristBeforeOld {
	public static void main (String args[]) throws IOException{
		FileWriter fw = new FileWriter("C:/Users/User/Desktop/S.txt",true); //the true will append the new data
		   fw.write("\n\r\n\r");
		RandomAccessFile f = new RandomAccessFile(new File("C:/Users/User/Desktop/S.txt"), "rw");
		f.seek(0); // to the beginning
		
		 
		f.write("Jennifer".getBytes());
		fw.write("\n\r\n\r");
		f.write("Jennifer".getBytes());
		fw.write("\n\r\n\r");
		fw.write("\n\r\n\r");
		f.write("Jennifer".getBytes());
		
		String str = "Jennifer";  
	    byte data[] = str.getBytes();       

	    try {                           
	            RandomAccessFile fa = new RandomAccessFile(new File("C:/Users/User/Desktop/S.txt"), "rw");
	            fa.getChannel().position(5);         
	            fa.write(data);
	            fa.close();
	    } catch (IOException e) {       
	            e.printStackTrace();
	    }
		
		
		
		
		
		
	}

}
