package Tutorial;

import java.util.Scanner;

public class partices {
	static Scanner n=new Scanner(System.in);
	static String[] a ={"java","python","C"};
	static double st=0.3;
	static double te=0.2;
	static double m=0.5;
    public static void main (String args[]){
    	String s=n.nextLine();
    	if (s.toLowerCase().equals(a[0].toLowerCase())) {
			pl("your book "+a[0]);
			me1(a[0]);
			
		}else if (s.toLowerCase().equals(a[1].toLowerCase())){
			pl("your book "+a[1]);
			me1(a[1]);
		}else if(s.toLowerCase().equals(a[2].toLowerCase())){
			
			pl("your book "+a[2]);
			me1(a[2]);
		}
    	
    	
    }
    static void me1(String tt){
    	String ans=n.nextLine();
    	double pi=200;
    	if(ans.toLowerCase().equals("student".toLowerCase())){
    		
    		pi=pi-(pi*st);
    		show(pi);
    	}else if(ans.toLowerCase().equals("teacher".toLowerCase())){
    		pi=pi-(pi*te);
    		show(pi);
    	}else if(ans.toLowerCase().equals("man".toLowerCase())){
    		pi=pi-(pi*m);
    		show(pi);
    	}else{
    		pl("not match");
    		
    	}
    	
    }
    static void show(double p){
    	pl("your price "+p+"taka ");
    	pl("---------------thank you----------------");
    	
    }
    static void pl(Object a){
   	 System.out.println(a);
   	  
    }
    static void pt(Object a){
   	 System.out.print(a);
   	 
    }
    
}
