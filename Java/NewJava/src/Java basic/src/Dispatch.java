
class A15 {
	void v(){
		System.out.println("AAAAAAAAAA");
		
	}

}
class B15 extends A15{
	void v(){
		System.out.println("BBBBBBBBBB");
		
	}
	
}
class C15 extends B15{
	void v(){
		System.out.println("CCCCCCCCCC");
		
	}
	
}
class Dispatch{
	public static void main (String args[]){
		A15 a=new A15();
		B15 b=new B15();
		C15 c=new C15();
		A15 r;
		r=a;
		r.v();
		r=b;
		r.v();
		r=c;
		r.v();
		
	}
	
}
