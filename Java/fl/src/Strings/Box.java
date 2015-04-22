package Strings;

public class Box {
	double a,b,c;
	
	Box(double a,double b,double c){
		
		this.a=a;
		this.b=b;
		this.c=c;
		
	}
	 public String toString(){
		
		return "Dimensions are "+a+" by "+b+" by "+c+".";
	}

}
