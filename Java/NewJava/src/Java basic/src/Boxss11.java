//import javax.swing.Box;


 class Box11 {
	 double a,b,c;
	 Box11(Box11 ob){
		 a=ob.a;
		 b=ob.b;
		 c=ob.c;
		 
		 
	 }
	 Box11(int i){
		 a=b=c;
		 
	 }
	 Box11(){
		 a=-1;
		 b=-1;
		 c=-1;
		 
	 }
	 Box11(int d,int e,int f){
		 this.a=d;
		 this.b=e;
		 this .c=f;
		 
	 }
	 void v(){
		 System.out.println("Valum is----->"+a*b*c);
		 
	 }

}
 
 class Boxss11{
	public static void main (String args[]){
		Box11 n=new Box11();
		Box11 m=new Box11(10);
		Box11 l=new Box11(10,30,24);
		Box11 ne=new Box11(l);
		ne.v();
		
		
	}
	 
 }
