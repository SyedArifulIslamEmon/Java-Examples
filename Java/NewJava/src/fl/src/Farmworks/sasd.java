package Farmworks;
import java.util.*;

public class sasd {
	public static void main (String args[]){
		LinkedList l=new LinkedList();
		l.add("F");
		 //ll.add("sdsd");
		 l.add("B");
		 l.add("D");
		 l.add("E");
		 l.add("C");
		 l.addLast("Z");
		 l.addFirst("A");
		 
		 l.add(1,"A2");
		 System.out.println(l);
		 l.removeFirst();
		 l.removeLast();
		 System.out.println(l);
		 
		 Object val=l.get(2);
		 System.out.println(l);
		 l.set(2,(String)val+"changed");
		 System.out.println(l);
	}

	
}
