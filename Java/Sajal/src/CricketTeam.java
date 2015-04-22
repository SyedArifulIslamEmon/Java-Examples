import java.util.Scanner;

public class CricketTeam {

	public void MemberName(String Countryname) {

		if (Countryname.equalsIgnoreCase("Bangladesh")) {

			System.out.println("-------bangladesh 11 team member name-------- ");

		}

		else if (Countryname.equalsIgnoreCase("pakistan")) {

			System.out.println("-------pakistan 11 team member name------- ");

		}

		else if (Countryname.equalsIgnoreCase("india")) {

			System.out.println("---------India 11 team member name-------- ");

		}
		else{
			
			System.out.println("-------YOU AR ENTER WORNG COUNTRY NAME---------");
		}

	}
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
