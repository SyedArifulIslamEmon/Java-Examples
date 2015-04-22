
public class Breakloop3 {
	public static void main (String args[]){
		for(int i=0;i<3;i++){
			
			System.out.print("Pass "+i+" :");
			for(int j=0;j<200;j++){
				System.out.print(j+" ");
				if(j==10)break;
				
			}
			System.out.println();
		}
		System.out.println("LOOp completr");
	}

}
