import java.util.Scanner;
public class Findprime {
	public static void main (String args[]){
		int n,i,j;
		boolean f;
		Scanner a= new Scanner (System.in);
		n=a.nextInt();
		
		for(i=1;i<n;i++){
			f=true;
			for(j=2;j<i/2;j++){
				if(i%j==0){
					f=false;
					break;
					
				}
				
			}
			if(f){
				System.out.println(i+"is prime");
				
			}
			
		}
		
		
	}

}
