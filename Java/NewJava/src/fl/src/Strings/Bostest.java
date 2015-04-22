package Strings;

import java.util.Scanner;

public class Bostest {
	public  static void main (String args[]){
		Scanner n =new Scanner (System.in);
		char c=n.nextLine().charAt(0);
		System.out.println(c);
		
		Box b=new Box(10,12,14);
		String s="Box b :"+b;
		System.out.println(b);
		System.out.println(s);
	}

}
