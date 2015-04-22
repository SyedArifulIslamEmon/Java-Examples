package Inheritance;

public class A1 {
	int i;

}
class B1 extends A1{
	int i;
	B1(int a,int b){
		super.i=a;
		this.i=b;
		
	}
  void s(){
	  
	  System.out.println(super.i);
	  System.out.println(i);
  }
	
}