
 class Test {
	int a;
	public int b;
	private int c;
	
	public void setc(int i){
		c=i;
	}
	
	public int getc(){
		return c;
	}
//}
	//pclass AccessTest{
public static void main (String args[]){
	
	Test ob=new Test();
	ob.a=10;
	ob.b=20;
	ob.setc(100);
	System.out.println("a,b,c:"+ob.a+" "+ob.b+" "+ob.getc());
}
}
