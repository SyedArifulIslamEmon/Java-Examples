
 class D4 {
	int i,j,k;
	D4(int a,int b,int c){
		i=a;
		j=b;
		k=c;
		
	}
	void v(){
		System.out.println("sum---->"+(i+j+k));
		
	}
	D4(){
		i=j=k=5;
	}

}
class B4 extends D4{
	int l;
	B4(int a,int b,int c){
	 i=a;
	 j=b;
	 k=c;
		
	}
	
}
class Ins3 {
	public static void main (String args[]){
		
		B4 n=new B4(10,20,30);
		D4 m=new D4();
		n.v();
		m.v();
	}
	
}