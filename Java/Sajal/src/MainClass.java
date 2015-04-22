

import java.util.Scanner;

public class MainClass {

	public static void main(String[] args)  {
		// TODO Auto-generated method stub
		String countryname;
		
		do {
			
			System.out.println("Chose country name :\nyour option Bangladesh,pakistan,india\nIf you type Exit your program is close ....");

			Scanner scanner = new Scanner(System.in);

			countryname = scanner.next();
			if(!countryname.equalsIgnoreCase("exit")){

			CricketTeam cricketTeam = new CricketTeam();

			cricketTeam.MemberName(countryname);
			}

		} while (!countryname.equalsIgnoreCase("Exit"));
		
		System.out.println("---------Thank you Good Bye---------");
		

	}

}
