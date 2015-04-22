
public class Ex {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int d,a;
		try{
			d=0;
			a=42/d;
			System.out.println("this will not be printed");
			
		}
		catch(ArithmeticException e){
			
			System.out.println("division by zero"+e);
		}
		System.out.println("after catch stattment");

	}

}
