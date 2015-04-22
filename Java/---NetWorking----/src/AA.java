import java.math.BigInteger;
import java.util.Scanner;


public class AA { 
    public static void main(String[] args){
        long start = System.nanoTime();
        System.out.println("enter a number:");
        Scanner scanner = new Scanner(System.in);
        BigInteger bigInt = scanner.nextBigInteger();
        boolean prime = bigInt.isProbablePrime(10);
        System.out.println(prime);
    }
}
