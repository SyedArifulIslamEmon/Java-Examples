
 class StaticD {
static int a=42,b=40;
static void v(){
	System.out.println("a= "+a);
	
}

}
class StaticDemo{
	public static void main(String args[]){
		StaticD.v();
		System.out.println("b=="+StaticD.b);
		
	}
	
}