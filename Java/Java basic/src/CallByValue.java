
class Call {
	int   v(int f,int g){
		f*=2;
		g/=2;
		return f;
		
		
	}

}
class CallByValue{
	public static void main (String args[]){
		Call n= new Call();
		int a=20,b=30;
		System.out.println("Call before -a-->"+a+"b--->"+b);
		
		int ai= n.v(a,b );
		//System.out.println("ai--->"+ai);
		System.out.println("Call after  -a-->"+a+"b--->"+b);
		
	}
	
}
