package InputFiles;

import java.io.*;

public class test {

	 import java.io.*;
	 public class test {
	   public static void main(String args[]) {
	    try {
	      String data= null;
	      File file=new File("student.txt");
	      FileReader fr =new FileReader(file,true);
	      BufferedReader br = new BufferedReader(fr);
	      while((data=br.readLine())!= null) {
	        String[] de = data.split(" "); 
	        if(de[0].equals("vimal")) {
	           data.trim();
	        }
	      }
	    } catch (IOException e) {
	        e.printStackTrace();
	    }
	    br.close()
	  }
	 }
}
