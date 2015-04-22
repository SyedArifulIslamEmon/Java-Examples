
 class Fac {
	 int v(int i){
		 int r;
		 if(i==1)return 1;
		 r=v(i-1)*i;
		 return r;
	 }

}
class Factt{
	public static void main (String args[]){
		Fac n=new Fac();
		System.out.println("Fact------->"+n.v(5));
		
	}
	
}