
public class TeamLaeder extends IT {
	
	private double extra;
	

	public TeamLaeder(String name, String post, double salary) {
		super(name, post, salary);
		
	}

	public TeamLaeder(String name, String post, double salary,double extra) {
		super(name, post, salary);
		this.extra=extra;
		
	}

	@Override
	public double salaryadd() {
		salary=salary+extra;
		return salary ;
	}

	@Override
	public String toString() {
		return "TeamLaeder [extra=" + extra + ", salary=" + salary
				+ "]";
				
				
	}

}
