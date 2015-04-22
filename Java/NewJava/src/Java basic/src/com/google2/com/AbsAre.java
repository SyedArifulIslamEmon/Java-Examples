package com.google2.com;

abstract class Figure {
	double a,b;
	Figure(double i,double j){
		a=i;
		b=j;
		
	}
	abstract double area();
}
class Rangle extends Figure{
	Rangle(double i,double j){
		super(i,j);
		
	}
	double area(){
		return a*b;
		
	}
	
}
class Tangle extends Figure{
	Tangle (double i,double j){
		super(i,j);
		
	}
	double area(){
		return a*b/2;
	}
	
}
class AbsAre{
	public static void main (String args[]){
		Rangle n=new Rangle(10,10);
		Tangle m=new Tangle(5,5);
		Figure f;
		f=n;
		System.out.println("AREA1---->"+f.area());
		f=m;
		System.out.println("area2----->"+f.area());
		
	}
	
}
