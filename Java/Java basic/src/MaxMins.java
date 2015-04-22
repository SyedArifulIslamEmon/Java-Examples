import java.util.*;
public class MaxMins {
     public static void main (String args[]){
    	 int a[],b,n,c,m,i,j;
    	 a=new int [50];
    	 Scanner in=new Scanner(System.in);
    	 n=in.nextInt();
    	 for(i=0;i<n;i++){
    		 a[i]=in.nextInt();
    		 
    	 }
    	 m=a[0];
    	 for(i=0;i<n;i++){
    		 if(m < a[i]){
    			 m=a[i];
    			 
    		 }
    		 
    	 }
    	 System.out.println("Max is ------->"+m);
     }
}
