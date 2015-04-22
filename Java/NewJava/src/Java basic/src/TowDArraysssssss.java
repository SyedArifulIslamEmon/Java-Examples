
public class TowDArraysssssss {
    public static void main (String args[]){
    	int i,j,k=0;
    	int a[][];
    	a=new int[5][5];
    	for(i=0;i<5;i++){
    		for(j=0;j<i+1;j++){
    			a[i][j]=k;
    			k++;
    		}
    		
    	}
    	for(i=0;i<4;i++){
    		for(j=0;j<i+1;j++){
    			System.out.print(a[i][j]+" ");
    		}
    		System.out.println();
    		
    	}
    	
    }
}
