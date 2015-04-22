package Strings;

import java.util.Scanner;

public class MakeString {
	public static void main (String args[]){
		Scanner n =new Scanner(System.in);
		String ss;
		ss=n.next();
		System.out.println(ss);
		
		char c[]={'j','a','v','a'};
		System.out.println(c);
		String s=new String(c);
		System.out.println(s);
		String s1=new String(s);
		System.out.println(s1);
	}

}
