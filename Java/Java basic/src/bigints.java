import java.math.BigInteger;
import java.util.Scanner;


public class bigints {
	public static void main (String args[]){
		Scanner sc = new Scanner(System.in);
		BigInteger bint = sc.nextBigInteger();
		BigInteger bint1 = sc.nextBigInteger();
		System.out.println(bint.add(bint1));
		
	}

}
