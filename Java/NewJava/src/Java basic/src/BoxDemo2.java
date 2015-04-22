
 class Boxss {
	 double a,b,c ;
	 

}
class BoxDemo2{
	public static void main (String args[]){
		Boxss m=new Boxss();
		Boxss n=new Boxss();
		m.a=3.4;
		m.b=5.2;
		m.c=7.5;
		double v=m.a*m.b*m.c;
		System.out.println("1st box volum is =---->"+v);
		n.a=5.5;
		n.b=6.423;
		n.c=12.65;
		v=n.a*n.b*n.c;
		System.out.println("2nd box volum is ----->"+v);
		
		
	}
}