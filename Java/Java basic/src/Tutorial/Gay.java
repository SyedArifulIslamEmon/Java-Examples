package Tutorial;

class B4 {
  int a,b;
  B4(int a,int b){
	  this.a=a;
	  this.b=b;
	  
  }
  void v(){
	System.out.println("a+b-------->"+(a+b));  
	  
  }
	
}
class Gay{
	public static void main(String args[]){
		B4 n=new B4(20,30);
		n.v();
		
	}
	
}
