
 class Box1 {
double wid,hei,dep;

}
class Boxdemo{
	public static void main (String args[]){
		Box1 p=new Box1();
		p.wid=10;
		p.hei=20;
		p.dep=15;
		double v=p.wid*p.hei*p.dep;
		System.out.println("VOLUM IS---->"+v);
		
	}
	
}