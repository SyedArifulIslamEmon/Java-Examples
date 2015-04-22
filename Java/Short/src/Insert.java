import java.util.Scanner;


public class Insert {
	
	public static void main (String args[]){
		
		int a[]=new int[40];
		int t;
		Scanner in= new Scanner(System.in);
		int n=in.nextInt();
		for (int i = 0; i < n; i++) {
			a[i]=in.nextInt();
		}
		
		for (int i = 1; i < n; i++) {
			int d=i;
			while (d>0&&a[d-1]>a[d]) {
				t=a[d-1];
				a[d-1]=a[d];
				 
				
				a[d]=t;
				d--;
			}
		}
		for (int i = 0; i < n; i++) {
			System.out.println(a[i]);
		}
		
	}

}
