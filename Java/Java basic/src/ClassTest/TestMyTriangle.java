package ClassTest;

public class TestMyTriangle {
	public static void main (String args[]){
		
		MyTriangle t1=new MyTriangle(1,5,1,5,1,5);
		System.out.println(t1);
		
		t1.printType();
		
		MyTriangle t2=new MyTriangle(1,5,3,8,9,4);
		System.out.println(t2.getPerimeter());
	}

}
