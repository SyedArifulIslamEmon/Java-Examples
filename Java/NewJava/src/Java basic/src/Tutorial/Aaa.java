package Tutorial;

import java.util.ArrayList;

public class Aaa {
	public static void main (String args[]){
		ArrayList a=new ArrayList();
		a.add("a");
		a.add("b");
		a.add(1,"c");
		pl("print array size");
		pl(a.size());
		pl("array");
		pl(a);
		a.remove("a");
		pl("after remove");
		pl(a);
		a.remove(1);
		pl("after remove");
		pl(a);
	}
   static void pl(Object a){
	   System.out.println(a);
	   
   }
   static void pt(Object a){
	   System.out.print(a);
	   
   }
   static void prf(Object printf)
   {
   System.out.printf("%s",printf);
   }
}
