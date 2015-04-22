
class A12 {
	int a,b;
	A12(int i,int j){
		a=i;
		b=j;
		
	}
	void v(int o,int p){
		System.out.println("sum"+(a+b));
		
	}
	A12(){
		
		
	}

}
class B12 extends A12{
	B12(int i,int j){
		a=i;
		b=j;
		
	}
	void v(int l,int m){
		System.out.println("$sum2--->"+(a+b));
		
	}
	
}
class Overrid{
	public static void main (String args[]){
		B12 n=new B12(10,20);
		A12 m=new A12(50,50);
		n.v(20,30);
		m.v(50,60);
		
	}
	
}