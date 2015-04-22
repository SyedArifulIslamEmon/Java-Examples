import java.util.*;
public class ArrayIn {
    public static void main(String args[]){
    	int a[],m;
    	a=new int[20];
    	Scanner n=new Scanner (System.in);
    	m=n.nextInt();
    	for(int i=0;i<m;i++){
    		a[i]=n.nextInt();
    	}
    	for(int i=0;i<m;i++){
    		System.out.println("a["+i+"]---->"+a[i]);
    		
    	}
    }
}
