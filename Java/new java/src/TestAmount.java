import java.util.Scanner;


public class TestAmount {
 public static void main (String args[]){
	 
	 int amount ;
	 double rate;
	 double time;
	 Scanner inp=new Scanner (System.in);
	 amount=inp.nextInt();
	 rate=inp.nextDouble();
	 time =inp.nextDouble();
	 
	 Amount a=new Amount(amount,rate,time);
	System.out.println( a.Intrests());
	 
	 
	System.out.println("Amount--->" +  a.Amounts());
 }
}
