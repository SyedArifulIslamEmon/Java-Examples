
 class Re {
 int a;
 Re(int i){
	 a=i;
	 
 }
 Re v(){
	 Re m=new Re(a+50);
	 return m;
	 
 }
}
class Reob {
	public static void main (String args[]){
		
		Re n=new Re(20);
		Re o;
		o=n.v();
		System.out.println("new return is---->"+n.a);
	}
	
}