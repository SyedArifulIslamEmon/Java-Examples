


class A14 {
	int a,b;
	A14(int i,int j){
		a=i;
		b=j;
		
	}
	void v(){
		System.out.println("sum---->"+(a+b));
		
	}

}
class B14 extends A14 {
	int c;
	B14(int i,int j,int k){
		super (i,j);
		c=k;
		
	}
	void v(){
		super.v();
		System.out.println(c);
		
	}
	
}
class Rid2{
	public static void main (String args[]){
		B14 n=new B14(50,50,30);
		n.v();
		
	}
	
}
