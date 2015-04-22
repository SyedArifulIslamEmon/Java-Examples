
 class Boxs7 {
	 double a,b,c;
	 Boxs7(double i,double j,double k){
		// System.out.println("BOx is ----->");
		 a=i;
		 b=j;
		 c=k;
		 
	 }
	 double v(){
		 return a*b*c;
		 
	 }

}
class Boxdamo7{
	public static void main(String args[]){
		Boxs7 n=new Boxs7(10,10,10);
		System.out.println("Volum is ----->"+n.v());
		
	}
	
}