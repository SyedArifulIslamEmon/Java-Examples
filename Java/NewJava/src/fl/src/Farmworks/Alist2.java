package Farmworks;

import java.util.ArrayList;

public class Alist2 {
	public static void main (String args[]){
		ArrayList a=new ArrayList();
		a.add(new Integer(1));
		a.add(new Integer(2));
		a.add(new Integer(3));
		a.add(new Integer(4));
		a.add(new Integer(4));
		a.add(new Integer(16));
		Object a1[]=a.toArray();
		int s=0;
	for(int i=0;i<a1.length;i++){
		s=s+((Integer)a1[i]).intValue();
	
		System.out.println(s);
	}	
	
	}
}
