package InputFiles;

import java.util.*;

public class InputFiles {
	public static void main (String args[]){
		
		int a;
		String s;
		char c;
		double d;
		float f;
		Scanner in =new Scanner(System.in);
		s=in.nextLine();
        System.out.println(s);
		a=in.nextInt();
		System.out.println(a);
		s=in.next();
		System.out.println(s);
		///c=in.next(".");
		 c = in.next().charAt(0);
		 System.out.println(c);
		//  c = in.findInLine(".").charAt(0);
		System.out.println(c);
		
		
		//------------char input net--------------
		Scanner reader = new Scanner(System.in);
         c = reader.next().trim().charAt(0);
         System.out.println(c);
		
        
          c = reader.next().charAt(0);
          
          System.out.println(c);
          
          d=in.nextDouble();
          System.out.println(d);
          f=in.nextFloat();
          System.out.println(f);
          
          s=in.nextLine();
          System.out.println(s);
	}

}
