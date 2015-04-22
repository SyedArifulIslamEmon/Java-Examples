
public class Ouch { 
	static int ouch =7 ;
	public static void main(String[]arg){
		new Ouch().go(ouch);
		System.out.print(""+ouch); 
		} 
	void go(int ouch){
		ouch --;
		for(int ouch=0;ouch<6;ouch++) // Duplicate local Variable (ouch)
		{ 
			System.out.println(""+ouch); }
		}
	}
