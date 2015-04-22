import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;


public class pass {
	public static void main (String args[]) throws FileNotFoundException{
		String s;
		 File file = new File ("C:/Users/User/Desktop/Pass.txt");
		 char a[]=new char[50];
		 char b[]=new char[50];
		Scanner n =new Scanner(System.in);
		if(!file.exists()){
		System.out.println("====Enter the password ======");
		 s=n.nextLine();
		
	   
		
	    PrintWriter printWriter = new PrintWriter (file);
	    printWriter.println (s);
	    printWriter.close (); 
		}
	    Scanner san =new Scanner(new File("C:/Users/User/Desktop/Pass.txt"));
		System.out.println("Enter log in passWord");
		String s1=n.nextLine();
		String s2=san.nextLine();
		if(s1.equals(s2)){
			
			System.out.println("log in ");
			
		}
		else {
			
			
			System.out.println("sorry wrong pass word ");
		}
		
	}

}
