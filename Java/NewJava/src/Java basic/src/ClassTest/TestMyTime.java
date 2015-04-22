package ClassTest;

public class TestMyTime {
	public static void main(String args[]) {
		System.out.println("please type hour 1-24 : minute 1-60 : second : 1-60");
		
		MyTime n1 = new MyTime(23, 4, 59);
		System.out.println(n1);
		System.out.println(n1.nextSecond());
		MyTime n2 = new MyTime(1, 0, 0);
		//System.out.println(n2);
		System.out.println(n2.nextSecond());
		//System.out.println(n2.nextMinute());
		System.out.println(n2.nextMinute());
		System.out.println(n2.nextHour());
		System.out.println(n2.nextSecond());
		System.out.println(n2.previousSecond());
		System.out.println(n2.previousMinute());
		System.out.println(n2.previousHour());
		
	}

}
