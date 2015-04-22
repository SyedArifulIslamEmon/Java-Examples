
 class D7 {
	 double a,b,c;
 
	 D7(){
a=b=c=-1;
}
	 D7(int i){
		 a=b=c=i;
		 
	 }
	 double v(){
		 return (a*b*c);
		 
	 }
}
 class B7 extends D7{
	 B7(int i,int j,int k){
		 a=i;
		 b=j;
		 c=k;
		 
	 }
	
}
class Ins6{
	public static void main (String args[]){
		
		B7 n=new B7(10,10,10);
		
		D7 m=new D7();
		m=n;
		System.out.println("Vol--->"+m.v());
		
	}
	
	
}