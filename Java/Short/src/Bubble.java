import java.util.Scanner;


public class Bubble {
	public static void main (String args[]){
		
		int a[]=new int[50];
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		int s;
		int falg=0;
		for (int i = 0; i < n; i++) {
			a[i]=in.nextInt();
		}
		for(int i=0;i<n;i++){
			for(int j=0;j<n-i-1;j++ ){
				
				if (a[j]>a[j+1]) {
					
			        s  = a[j];
			        a[j]   = a[j+1];
			        a[j+1] = s;
			        falg=1;
			        }
				if (falg==0) {
					break;
				}
			}
		}
			for(int k=0;k<n;k++){
				
					
					System.out.print(a[k]+" ");
						
					
					
				}
			
			
		
		
		
	}

}
