package Tutorial;

class A3 {
 int a,b;
 void v(int a,int b){
	 System.out.println("a+b--->"+(a+b));
	 
 }
 
}
class A2{
	public static void main (String args[]){
		A3 n=new A3();
		n.a=20;
		n.b=30;
		///n.v();
		System.out.println("a+b----------->"+(n.a+n.b));
		
	}
	
}