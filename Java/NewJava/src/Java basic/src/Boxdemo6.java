
 class Box6 {
	 double a,b,c;
	 Box6(){
		 System.out.println("BOx is ----->");
		 a=10;
		 b=10;
		 c=10;
		 
	 }
	 double v(){
		 return a*b*c;
		 
	 }

}
class Boxdemo6{
	public static void main(String args[]){
		Box6 n=new Box6();
		//System.out.println("Volum is ----->"+n.v());
		
	}
	
}