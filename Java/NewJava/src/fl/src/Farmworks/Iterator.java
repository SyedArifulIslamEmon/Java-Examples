package Farmworks;

import java.util.ArrayList;
import java.util.*;

public class Iterator {
	public static void main (String args[]){
		
		ArrayList al=new ArrayList();
		
		al.add("A");
		al.add("B");
		al.add("C");
		al.add("D");
		al.add("E");
		al.add("F");
		System.out.println(al);
		
		Iterator itr=(Iterator) al.iterator();
		while(itr.hasNext()){
		Object element = itr.next();
		System.out.println(element);
			
			
			
		}
		
		
		
		
		
		
	}

	

}
