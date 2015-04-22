
 class D2 {
	 int a,b;
	  void setva(int i,int j){
		  a=i;
		  b=j;
	  }
		  void sij(){
			  System.out.println("a--->"+a+"  b---->"+b);
			  
		  }
	  

}
class B2 extends D2{
	int k;
	void t(){
		k=a+b;
		System.out.println("total k-->"+k);
		
	}
	
}
class Ins1 {
	public static void main (String args[]){
		D2 m=new D2(); 
		B2 n=new B2();
		m.setva(10,20);
		n.setva(10, 20);
		n.t();
	}
	
}