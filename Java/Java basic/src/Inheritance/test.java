package Inheritance;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		A sup=new A();
		B sub=new B();
		sup=sub;
		sup.i=10;
		sup.j=20;
		sup.Showij();
		sup.i=12;
		sub.j=12;
		sub.k=12;
		sub.showk();
		sup.Showij();
		sup.Showij();
		sup.Showij();
		

	}

}
