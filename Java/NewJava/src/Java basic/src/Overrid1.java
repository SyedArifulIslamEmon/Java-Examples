

class A13 {
	int a,b;
	A13(int i,int j){
		a=i;
		b=j;
		
	}
	void v(){
		System.out.println("sum---->"+(a+b));
		
	}

}
class B13 extends A13 {
	int c;
	B13(int i,int j,int k){
		super (i,j);
		c=k;
		
	}
	void v(String a){
		System.out.println(a+c);
		
	}
	
}
class Overrid1{
	public static void main (String args[]){
		B13 n=new B13(50,50,30);
		n.v("this is K :");
		n.v();
	}
	
}