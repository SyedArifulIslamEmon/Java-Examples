
 class AA {
	 int a,b;
   AA(int i ){
	   a=i;
	   
   }
   void s(){
	   System.out.println("sum----->"+(a+b));
	   
   }
}
 
 class BB extends AA{
	// int f;
	 BB(int j,int i){
		 super(i);
		 b=j;
		// a=i;
		 
	 }
	 
	 
 }
class Calls {
	public static void main (String args[]){
		
		BB n=new BB(10,50);
		n.s();
	}
	
	
}