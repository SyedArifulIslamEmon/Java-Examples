package Tutorial;

 class B2 {
int a,b,c;

}
class A4{
	public static void main (String args[]){
		B2 n=new B2();
		B2 m=new B2();
		n.a=10;
		n.b=20;
		n.c=20;
		System.out.println("a+b+c------>"+(n.a+n.b+n.c));
		
		m.a=60;
		m.b=20;
		m.c=20;
		System.out.println("a+b+c------>"+(m.a+m.b+m.c));
	}
	
}