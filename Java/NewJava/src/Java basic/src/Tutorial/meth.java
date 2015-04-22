package Tutorial;

public class meth {
static int	a=10;
static int b=20;
	public static void main (String args[]){
		
	//	int a,b;
		//int a;
		//int b;
		a=add(a,b);
		System.out.println(add(a,b));
		System.out.println(a);
		System.out.println(a>b? a: b);
		a=a>b?a:b;
		System.out.println(a);
		
	}
static int add(int a,int b){
	a=a+b;
	return a;
	
}
}
