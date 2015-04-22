package Tutorial;

import java.util.*;

public class Llist {
	public static void main (String args[]){
		int b;
	LinkedList l = new LinkedList();
	
	l.add("parvez");
	l.add("nahid");
	l.add("rabbir");
	l.add("sunny");
	l.add("tuhin");
	try{
		
		b=10/0;
	} catch (Exception e) {
		e.printStackTrace();
		// TODO: handle exception
	}
	
	l.add("tora 14 tharik a kar shata dating a jabe... ");
	pl(l);
	l.remove(1);

}
	static void pl(Object a){
		   System.out.println(a);
		   
	   }
	   static void pt(Object a){
		   System.out.print(a);
		   
	   }
}