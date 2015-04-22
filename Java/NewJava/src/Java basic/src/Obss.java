
 class Obs {
	 int i,j;
	 Obs(int a,int b){
		 i=a;
		 j=b;
		 
	 }
	 boolean v(Obs o){
		if( o.i==i&&o.j==j){
			System.out.println("o.i-->"+o.i+"o.j-->"+o.j);
			return true;
		}
		else {
			System.out.println("o.i-->"+o.i+"o.j-->"+o.j);
			return false;
			
		}
	 }

}
class Obss{
	public static void main (String args[]){
		Obs n=new Obs(10,20);
		Obs m=new Obs(30,40);
		System.out.println("dbjdb----->"+n.v(m));
	}
	
}