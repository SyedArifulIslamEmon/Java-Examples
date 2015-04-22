import java.util.Scanner;


public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Array n=new Array();
		
		int nu;
		Scanner scanner=new Scanner(System.in);
		nu=scanner.nextInt();
		int []a=new int[100];
		
		for(int i=0;i<nu;i++){
			a[i]=scanner.nextInt();
			
		}
		System.out.println(n.sum(a, nu));
	}

}
