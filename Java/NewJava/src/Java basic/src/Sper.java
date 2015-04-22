
class A8 {
	int a,b,c;
	A8(A8 ob){
		a=ob.a;
		b=ob.b;
		c=ob.c;
		
	}
	A8(){
		a=b=c=1;
		
	}
	A8(int a,int b,int c){
		this.a=a;
		this.b=b;
		this.c=c;
		
	}
	int v(){
		return a*b*c;
		
	}

}
class B8 extends A8{
	int d;
	B8(B8 ob){
		super (ob);
		d=ob.d;
	}
	B8(int i,int j,int k,int l ){
		super(i,j,k);
		d=l;
	}
	B8(){
	super();
	d=10;
		
	}
	
}
class Sper{
	public static void main (String args[]){
		B8 n=new B8(10,20,30,40);
		B8 m=new B8(10,10,10,5);
		B8 o=new B8();
		B8 p=new B8(m);
		System.out.println("valum is --->"+n.v());
		System.out.println("v---->"+p.v());
	}
	
}