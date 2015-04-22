import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;


public class TestFile {
	public static void main (String args[]) throws FileNotFoundException{
		
		
		int a,b,c,mul;
		Scanner in =new Scanner (new File("C:/Users/User/workspace/File/src/T.txt"));
		
		a=in.nextInt();
		b=in.nextInt();
		c=in.nextInt();
		mul=a*b*c;
		
	    PrintWriter printWriter = new PrintWriter (new File("C:/Users/User/Desktop/S.txt"));
	    System.out.println(mul);
	    printWriter.println (mul);
	    printWriter.close ();  
	}

}
