
 class Te {
	 void v(){
		 System.out.println("No peremeter");
		 
	 }
void v(int a){
	System.out.println("a is ------->"+a);
	
}
int v(int a,int b){
	System.out.println("a is ----->"+a+"b is ----->"+b);
	return a+b;
}
void v(double d){
	System.out.println("d is ----->"+d);
	
}
void v(char c){
	System.out.println("c is---->"+c);
}
}
class Test1{
	public static void main (String args[]){
		Te n=new Te();
		n.v();
		n.v(10);
		System.out.println("return value is "+n.v(20,30));
		n.v(20,30);
		
		n.v('r');
		n.v(2.4545);
		
	}
	
}