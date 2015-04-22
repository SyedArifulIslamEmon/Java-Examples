package InputFiles;

import java.io.File;
import java.util.Scanner;

public class FileTryCatch {
	public static void main (String args[]){
		int i;
		String s;
		double d;
		char c;
		
		try {
			
			Scanner in =new Scanner(new File("C:/Users/User/Desktop/Fuck.txt"));
			i=in.nextInt();
			System.out.println(i);
			s=in.next();
			System.out.println(s);
			d=in.nextDouble();
			System.out.println(d);
			c=in.next().charAt(0);
			System.out.println(c);
			
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}
		
		
	}

}
