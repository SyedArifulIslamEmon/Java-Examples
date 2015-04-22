package Tutorial;

import java.util.Scanner;

public class try1 {
     public static void  main (String args[]) {
		int b ;
    	Scanner n=new Scanner(System.in); 
    	b=n.nextInt();
    	 try {
    	
    	while (b<50){
    	System.out.println(100/b);
    	//b=n.nextInt();
    	b++;
    	}
		} catch (Exception e) {
		
			e.printStackTrace();
		}finally{
			//b++;
			System.out.println("came to finally bolck"+b);
			
		}
    	 System.out.println("this is after try catch");
	}
}
