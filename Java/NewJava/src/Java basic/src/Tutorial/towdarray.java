package Tutorial;

import java.util.Scanner;

public class towdarray {
	public static void main (String args[]){
		int a[][];
		a=new int [5][5];
		Scanner n =new Scanner(System.in);
		for(int i=0;i<3;i++){
			for(int j=0;j<3;j++){
				a[i][j]=n.nextInt();
				
			}
			
		}
		for(int i=0;i<3;i++){
			for(int j=0;j<3;j++){
				//a[i][j]=n.nextInt();
				pt("\t"+a[i][j]);
			}
			pl("\n");
			
		}
	}
	 static void pl(Object a){
    	 System.out.println(a);
    	 
     }
     static void pt(Object a){
    	 System.out.print(a);
    	 
     }

}
