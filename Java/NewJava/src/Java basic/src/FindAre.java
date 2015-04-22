
class A16 {
	double a,b;
	A16(double i,double j){
		a=i;
		b=j;
		
	}
	double area(){
		return a*b;
		
	}
	

}
class B16 extends A16{
	B16(double i,double j){
	super(i,j);	
		
	}
	double area(){
		return a*b;
		
	}
	
}
class C16 extends B16{
	C16(double i,double j){
		super(i,j);
		
	}
	double area(){
		return a*b/2;
		
	}
	
}
class FindAre{
public static void main(String args[]){
A16 m=new A16(5,5);
C16 n=new C16( 10,20);

A16 r;
r=n;
System.out.println("Vol---->"+r.area());
r=m;
System.out.println("1----->"+r.area());

	
}
}