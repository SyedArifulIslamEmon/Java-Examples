
 class Statics {
 static int a,b,c;
 static void v(){
	 System.out.println("a="+a);
	 System.out.println("b="+b);
	 System.out.println("c="+c);
	 
	 
 }
 static {
	 a=10;
	 b=20;
	 c=30;
	 
 }
 public static void main(String args[]){
	 v();
	 
 }

}
