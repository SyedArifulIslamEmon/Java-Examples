
public class ContinueLabels {
	public static void main (String args[]){
		o: for(int i=0;i<3;i++){
			  for(int j=0;j<3;j++){
				  
				  if(j>i) {
					  System.out.println();
					  continue o;
				  }
				  System.out.print(" "+(i*j));
				  
			  }
			  
			
		}
	System.out.println();
	}

}
