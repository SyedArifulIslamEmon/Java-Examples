
 class D5 {
	 int i,j;
	 D5(int a,int b){
		 i=a;
		 j=b;
		 
	 }
//	 D5(){
//		 
//	 }
	 void v(){
		 System.out.println("Sum---->"+(i+j));
		 
	 }

}
 
 class B5 extends D5{
	 int k,l;
	 B5(int c,int d,int a,int b){
		 super(a,b);
		 k=c;
		 l=d;
		 
	 }
	 void v(){
		 super.v();
		 System.out.println("Sum --->"+(k+l));
		 
	 }
	
	 
 }
 class Ins4{
	 public static void main (String args[]){
		 
		// D5 n=new D5(20,50);
		 B5 m=new B5(10,25,70,30);
		 m.v();
		 ///n.v();
	 }
	 
 }
