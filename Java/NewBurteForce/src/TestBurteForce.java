
//main class -----------


import java.util.Scanner;


public class TestBurteForce {

	public static void main(String[] args) {
	
		Scanner nScanner=new Scanner(System.in);
		System.out.println("Enter Test String ---->  ");
		String s1=nScanner.next();   // 1 ta char input dila worng
		
		System.out.println("Enter Search String ---->  ");
		String s2=nScanner.next();   // 
		
		BurteForce burteForce=new BurteForce(s1, s2);
		
		int find =burteForce.Stringmatch();
		
		if(find != -1){
		System.out.println("String is found and String position is "+find);

		}
		
		else {
			
			System.out.println("String not found");
			
		}
	}

}
