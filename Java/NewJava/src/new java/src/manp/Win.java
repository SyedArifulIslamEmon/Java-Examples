package manp;

import java.io.*;
public class Win
{
public static void main(String[] Miller) throws IOException{
	
		Process process =Runtime.getRuntime().exec("/C:WINNTsystem32calculator.exe");
	
 
         try {
			process.waitFor();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
}
}
