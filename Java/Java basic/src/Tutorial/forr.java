package Tutorial;

import java.util.Scanner;

public class forr {
     public static void main (String args[]){
    	 int i,j;
    	 Scanner n=new Scanner(System.in);
    	// for(i=0;i<10;i++){
    		// System.out.println(i);
    		 
    	// }
    	 int a[][]=new int [5][5];
    	 for(i=0;i<3;i++){
    		 for(j=0;j<2;j++){
    			 System.out.println("a["+i+"]["+j+"]=--->");
    			 a[i][j]=n.nextInt();
    			 
    		 }
    	 }

    	 //int a1[][]=new int [5][5];
    	 for(i=0;i<3;i++){
    		 for(j=0;j<2;j++){
    			 System.out.print("\t"+a[i][j]);
    			 
    		 }
    		 System.out.println();
    	 }
    	 
     }
}
