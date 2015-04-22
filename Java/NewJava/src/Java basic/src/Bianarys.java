import java.util.*;
public class Bianarys {
    public static void main (String args[]){
    	int i=0,j,k,a[],n,m,b;
    	a=new int[50];
    	Scanner in = new Scanner(System.in);
    	b=in.nextInt();
    	while (b!=0){
    		a[i++]=b%2;
    		b=b/2;
    		
    	}
    	for(j=i;j>=0;j--){
    		System.out.println("a["+j+"]------>"+a[j]);
    		
    	}
    }
}
