
class Bx{
	double a,b,c;
	public double v(){
		System.out.println("Volum is ---->"+(a*b*c));
		return a*b*c;
	}
	
}
class BoxDm{
	public static void main (String args[]){
		Bx n=new Bx();
		n.a=2.4;
		n.b=4.6;
		n.c=5.56;
		System.out.println("New return value is ---->"+n.v());
		
	}
	
}