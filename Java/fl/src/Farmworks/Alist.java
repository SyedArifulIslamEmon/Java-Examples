package Farmworks;

import java.util.ArrayList;

public class Alist {
	public static void main (String args[]){
		ArrayList a=new ArrayList();
		System.out.println(a.size());
		a.add("C");
		a.add("D");
		a.add("E");
		a.add("f");
		a.add(0,"aaaaaa");
		System.out.println(a.size());
		System.out.println(a);
		a.remove("f");
		System.out.println(a);
		a.remove(0);
		System.out.println(a);
		
	}

}
