package Thaadssss;

public class ThreadDemo {
     public static void main(String[] args) {
		new NewThread();
		try {
		for(int i=5;i>0;i--){
			System.out.println("main--->"+i);
			
				Thread.sleep(1000);
		}
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
     
		System.out.println("main thread exit");
	}
}
