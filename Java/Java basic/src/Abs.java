
abstract class A17 {

	abstract void v();
	void v1(){
		System.out.println("this is concrete method");
	}
}
abstract class B17 extends A17{
 abstract void v();//{
		
	//	System.out.println("B is kkkkkkkk");
	//}
 void v2(){
	 System.out.println("22222222222");
	 
 }
 abstract void v3();
	
}
class C17 extends B17{
	void v(){
	System.out.println("abs1");	
		
	}
	void v3(){
		
		System.out.println("dsfsfdf");
	}
	
	
}

class Abs {
	public static void main(String args[]){
		C17 n=new C17();
		n.v();
		n.v2();
		//n.v2();
		//n.v3();
	}
}