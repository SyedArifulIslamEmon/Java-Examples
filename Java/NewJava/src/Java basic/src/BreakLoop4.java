
public class BreakLoop4 {
    public static void main (String args[]){
    	o: for(int i=0;i<3;i++){
    		System .out.print("pass"+i+" :");
    		for(int j=0;j<100;j++){
    		System.out.print(j+" ");
    		if(j==10){
    			break o;
    			
    		}
    		
    		}
    		System .out.println("this is not print");
    	}
    	System.out.println("loop is brek");
    }
}
