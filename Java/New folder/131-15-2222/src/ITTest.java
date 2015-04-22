
public class ITTest {

	public static void main(String[] args) {
		TeamLaeder teamLaeder=new TeamLaeder("parvez", "senior", 30000, 3000);
		System.out.println(teamLaeder);
		System.out.println("New Salary = "+teamLaeder.salaryadd());
		
		Developer developer=new Developer("sudip", "jounir", 10000,500);
		System.out.println(developer);
		System.out.println("New Salary = "+developer.salaryadd());

	}

}
