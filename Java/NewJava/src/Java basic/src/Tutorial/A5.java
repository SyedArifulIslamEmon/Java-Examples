package Tutorial;

class A6 {
	int a,b,c;
	void v(){
		System.out.println("a+b+c------>"+(a+b+c));
		
	}

}
class A5{
	public static void main (String args[]){
		A6 n=new A6();
		n.a=20;
		n.b=30;
		n.c=40;
		n.v();
		
	}
	
}