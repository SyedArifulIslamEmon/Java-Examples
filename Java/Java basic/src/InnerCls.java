
 class outer {
   int i=10;
   void v(){
	   Inner n=new Inner();
	   n.c();
	   
	   
   }
   class Inner{
	   void c(){
		   System.out.println("outer is --->"+i);
		   
	   }
	   
   }
}
class InnerCls{
	public static void main (String args[]){
		outer m=new outer();
		m.v();
		
	}
}