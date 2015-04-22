package Thaadssss;

public class Th1 {
	 public static void main(String[] args) {
			new Ethread();
			try{
			for(int i=5;i>0;i--){
				System.out.println("main--->"+i);
				
					Thread.sleep(1000);
			}
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					System.out.println("main thread interrupted");
				}
			
	 
			System.out.println("main thread exit");
		
}
}
