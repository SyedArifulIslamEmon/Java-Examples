import java.util.*;
public class Averagess {
	public static void main (String args[]){
		int a[],i,j,n,b,s=0;
		a=new int[50];
		Scanner nu=new Scanner(System.in);
		n=nu.nextInt();
		for(i=0;i<n;i++){
			a[i]=nu.nextInt();
			
		}
		for(i=0;i<n;i++){
		s=s+a[i];	
			
		}
		System.out.println("Avarage is--------->"+s/n);
		
	}

}
