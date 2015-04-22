
class Box3{
	double a,b,c;
	public double vol (){
		//System.out.println("Volum is ----->"+(a*b*c));
		return a*b*c;
	}
	
}
class BoxDemo3{
	public static void main (String args[]){
		Box3 n=new Box3();
		n.a=5;
		n.b=5;
		n.c=5;
		//n.vol();
		System.out.println("Volum is -----> "+n.vol());
		
		
	}
	
}
