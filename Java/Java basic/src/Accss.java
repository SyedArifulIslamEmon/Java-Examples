
class Access {
	
  public int a,b;
  private int c;
  void setc(int i){
	  c=i;
	  
  }
void v(){
	System.out.println("Volum is --->"+(a+b+c));
	
}

}
class Accss{
	public static void main (String args[]){
		Access n=new Access();
		n.a=10;
		n.b=20;
		n.setc(10);
		n.v();
		
	}
	
}