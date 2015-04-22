package Tutorial;
import java.util.*;
public class Ifels {
	public static void main (String args[]){
	int a;
	Scanner n=new Scanner (System.in);
	a=n.nextInt();
	int b=n.nextInt();
	if(a>b){
		pl("a is big");
		
	}else if(a==b){
		pl("same");
		
	}
	else {
		if(a==20){
			pl("lucky num");
			
		}
		else{
		pl("ok");
	}
		
	}
	}
	static void pl(Object a){
   	 System.out.println(a);
   	 
    }
    static void pt(Object a){
   	 System.out.print(a);
   	 
    }

}
