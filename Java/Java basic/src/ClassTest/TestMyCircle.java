package ClassTest;

public class TestMyCircle {

	public static void main(String args[]) {

		MyCircle C1 = new MyCircle(10, 10, 3);
		System.out.println(C1);
		System.out.println("Area---->" + C1.getArea());
		
		MyCircle C2 = new MyCircle(new MyPoint(20,30), 20);
		System.out.println(C2);
		System.out.println(C2.getCenterY());

		System.out.println(C2.getArea());
	}

}
