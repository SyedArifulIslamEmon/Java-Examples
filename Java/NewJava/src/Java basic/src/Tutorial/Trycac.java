package Tutorial;

import java.util.Scanner;

public class Trycac {
	 static Scanner n;

	public static void main (String args[]){
	double d=0,c;
	try{
	d=10/0;	
	c=10;
	System.out.println("C------->"+c);
	}catch(Exception e){
		e.printStackTrace();
		//System.out.println(e);
		
	}finally{
		d++;
		System.out.println("\n\n"+d);
	}
	 int i,j;
	 n = new Scanner(System.in);
		 
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

