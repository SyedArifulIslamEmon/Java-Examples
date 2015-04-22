package Tutorial;
import java.util.*;
public class Swth {
	public static void main (String args[]){
		Scanner n=new Scanner(System.in);
		int a;
		switch(a=n.nextInt()){
		case 1:
			pl("number is 1");
		break;
		case 2:
			pl("number is 2");
		break;
		case 3:
			pl("number is 3");
		break;
		case 4:
			pl("number is 4");
		break;
		case 5:
			pl("number is 5");
		break;
		case 6:
			pl("number is 6");
		break;
		default:
			pl("not match");
		 break;
		}
		//System.out.println();
	}
	static void pl(Object a){
	   	 System.out.println(a);
	   	 
	    }
	    static void pt(Object a){
	   	 System.out.print(a);
	   	 
	    }

}
