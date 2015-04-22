import java.util.Scanner;


public class Selection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[]=new int[50];
		int s;
		Scanner in=new Scanner(System.in);
		
		int n=in.nextInt();
		for (int i = 0; i < n; i++) {
			a[i]=in.nextInt();
		}
		for (int i = 0; i < n-1; i++) {
		int p=i;
		     for (int j =i+1; j <n; j++) {
		    	 if (a[p]>a[j]) {
					p=j;
				}
				if (p!=i) {
			         s = a[i];
			         a[i] = a[p];
			         a[p] = s;

				}
			}
		
		}
		for (int i = 0; i < n; i++) {
			System.out.println(a[i]);
		}

	}

}
