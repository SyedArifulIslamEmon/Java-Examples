
 class Call1 {
	 int a,b;
	 Call1(int i,int j ){
		a= i;
		b=j;
		 
	 }
	 void v(Call1 o){
		o.a*=2;
		o.b/=2;
		 
	 }

}
class CallByRef{
	public static void main(String args[]){
		
		int a=10,b=10;
		Call1 n=new Call1(a,b);
		System.out.println("a-->"+n.a+"b-->"+n.b);
		
		n.v(n);
		System.out.println("a-->"+n.a+"b-->"+n.b);
		
	}
	
}