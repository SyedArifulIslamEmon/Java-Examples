
 class Bxs1 {
	 double a,b,c;
	 Bxs1(){
		 a=-1;
		 b=-1;
		 c=-1;
		 
	 }
	 Bxs1(double a,double b,double c){
		 
		 this.a=a;
		 this.b=b;
		 this.c=c;
	 }
	 Bxs1(double a){
		 a=b=c;
		 
	 }
	 void v(){
		 System.out.println("value is "+a*b*c);
		 
	 }

}
 class OverLoadings{
	 public static void main (String args[]){
		 Bxs1 n=new Bxs1();
		 Bxs1 m=new Bxs1(2.3,4.5,2.2);
		 Bxs1 h=new Bxs1(2.5);
		 n.v();
		 m.v();
		 h.v();
		 
	 }
	 
	 
 }
