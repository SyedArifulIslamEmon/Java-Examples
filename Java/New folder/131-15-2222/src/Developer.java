
public class Developer extends IT {
	private double rise;
	
	

	public Developer(String name, String post, double salary) {
		super(name, post, salary);
		
	}

	public Developer(String name, String post, double salary,double rise) {
		super(name, post, salary);
		this.rise=rise;
		}
	
	public double salaryadd() {
		salary=salary+rise;
	return salary;
	}

	@Override
	public String toString() {
		return "Developer [rise=" + rise + ", salary=" + salary+"]";
	}
	

}
