package InputFiles;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileScannerss {
	public static void main (String args[])throws FileNotFoundException{
		
		int i;
		double d;
		String s;
		char c;
		Scanner in=new Scanner(new File("C:/Users/User/Desktop/Fuck.txt"));
		 i=in.nextInt();
		 System.out.println(i);
		 s=in.next();
		 System.out.println(s);
		 d=in.nextDouble();
		 System.out.println(d);
		 c=in.next().charAt(0);
		 System.out.println(c);
		
		
		
		
		
	}

}
