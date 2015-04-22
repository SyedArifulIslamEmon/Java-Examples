package Tutorial;

import java.util.Scanner;

public class operttor {
	public static void main (String args[]){
		int a,b,c;
		Scanner n=new Scanner(System.in);
		a=n.nextInt();
		b=n.nextInt();
		c=n.nextInt();
		if(a>b || a>c){
			
			System.out.println("a is big");
			
		}
		else{
			if(b>c){
				System.out.println("b is big ");
				
			}
			else{
				System.out.println("C is big");
				
			}
			
		}
	}

}
