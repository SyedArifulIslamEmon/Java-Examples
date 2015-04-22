
 class Tests {
	int a;
	public int b;
	private int c;
	
	public void setc(int i){
		c=i;
	}
	
	public int getc(){
		return c;
	}
}
	class AccessTest{
public static void main (String args[]){
	
	Test ob=new Test();
	ob.a=10;
	ob.b=20;
	ob.setc(2000);
	System.out.println("a,b,c:"+ob.a+" "+ob.b+" "+ob.getc());
}
}
