import java.util.Scanner;


public class Exchange {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[]=new int[50];
		
		Scanner in=new Scanner(System.in);
		int s;
		int n=in.nextInt();
		
		for (int i = 0; i < n; i++) {
			a[i]=in.nextInt();
		}
		for (int i = 0; i < n-1; i++) {
		
			for (int j =i+ 1; j < n; j++) {
				if (a[i]>a[j]) {
				s=a[i];	
				a[i]=a[j];
				a[j]=s;
				}
			}
		}
		for (int i = 0; i < n; i++) {
			System.out.print(a[i]);
		}

	}

}
