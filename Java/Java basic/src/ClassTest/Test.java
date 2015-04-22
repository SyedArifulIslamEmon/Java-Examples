package ClassTest;

public class Test {
	public static void main (String args[]){
		Radius radius1=new Radius();
		System.out.println("1st circle is --->"+radius1.getradius()+"\n Area--->"+radius1.getArea());
		Radius radius2=new Radius(2.35);
		System.out.println("1st circle is --->"+radius2.getradius()+"\n Area--->"+radius2.getArea());
		
	}

}