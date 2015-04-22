package Inheritance;

public class A {
	int i,j;
	
	void Showij(){
		
		System.out.println("i="+i+"j="+j);
	}

}
class B extends A{
	int k;
	void showk(){
		
		System.out.println(k);
	}
	void sum (){
		
		System.out.println(i+j+k);
	}
//void Showij(){
//		
//		System.out.println("B::i="+i+"j="+j);
//	}
}
