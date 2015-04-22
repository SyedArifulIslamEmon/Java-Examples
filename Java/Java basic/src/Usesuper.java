
 class A9 {
	 int i;

}
class B9 extends A9{
	int i;
	B9(int a,int b){
		super.i=a;
		i=b;
		
	}
	void v(){
	 System.out.println("value super 1-----"+super.i);
	 System.out.println("value sub--------->"+i);
		
	}
	
}
class Usesuper{
	public static void main (String args[]){
		B9 n=new B9(10,20);
		n.v();
		
		
	}
	
}