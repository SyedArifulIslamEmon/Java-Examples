
public class Grp {
	String subject;
	
	String grade;
	double gradepoint;
	int credit;
	public Grp(String subject, String grade, double gradepoint, int credit) {
		super();
		this.subject = subject;
		this.grade = grade;
		this.gradepoint = gradepoint;
		this.credit = credit;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public String getGrade() {
		return grade;
	}
	public void setGrade(String grade) {
		this.grade = grade;
	}
	public double getGradepoint() {
		return gradepoint;
	}
	public void setGradepoint(double gradepoint) {
		this.gradepoint = gradepoint;
	}
	public int getCredit() {
		return credit;
	}
	public void setCredit(int credit) {
		this.credit = credit;
	}
	public void S(){
		
		if(gradepoint==4.0){
			
			System.out.println("frist class");
		}
		else if(gradepoint>=3.0&&4.0>gradepoint){
			
			System.out.println("second class");
		}
		else if(gradepoint>=2.0&&3.0>gradepoint){
			
			System.out.println("thrid class");
		}
	}
	@Override
	public String toString() {
		return "subject=" + subject + ", grade=" + grade + ", gradepoint="
				+ gradepoint + ", credit=" + credit ;
	}
	

	
	

}
