
class A11 {
	A11(){
		
		System.out.println("AAAAAA");
		
	}

}
class B11 extends A11{
	B11(){
		System.out.println("BBBBBB");
		
	}
	
}
class C11 extends B11{
	C11(){
		System.out.println("CCCCCC");
		
	}
	
}
class Paraless{
	public static void main (String args[]){
		C11 c=new C11();
		
		
	}
	
}