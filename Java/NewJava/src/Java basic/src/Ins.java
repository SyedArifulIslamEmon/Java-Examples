
class D1 {
	int a,b,c;
	D1(){
		
	}
	D1(int i,int j){
		a=i;
		b=j;
		
	}
	void shw(){
	System.out.println("a="+a+"  b="+b);	
		
	}

}
class B1 extends D1{
	 B1(int i,int j,int k){
		// super(i, j);
//	a=i;
		//b=j;
//	c=k;
		
	}
	void s(){
		System.out.println("total ----->"+(a+b));
		
	}
	
}
class Ins{
	public static void main (String args[]){
		B1 n=new B1(5,7,30);
		D1 m=new D1(30,40);
		n.shw();
		
	}
	
}