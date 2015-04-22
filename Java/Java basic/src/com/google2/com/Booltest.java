package com.google2.com;

public class Booltest {
	public int i=100;
    public static void main (String args[]){
    	
   boolean b;
  
   b=false;
   System.out.println("b is --->"+b);
    	
   b=true;
   System.out.println("b is =--->"+b);
   if(b){
	   System.out.println("This is excuted");
	   
   }
   b=false;
		   if(b){
			   System.out .println("This not excuted");
			   
		   }
		   System.out.println("10>9 is "+(10==9));
    }
}
