import java.util.Scanner;


public class Gp1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner inp=new Scanner(System.in);
		String subject=inp.nextLine();
		String grade=inp.nextLine();
		double gradepoint=inp.nextDouble();
		int credit=inp.nextInt();
		

		Grp n=new Grp(subject,grade,gradepoint,credit);
		System.out.println(n);
		
		n.S();
		
		

		
	}

}
