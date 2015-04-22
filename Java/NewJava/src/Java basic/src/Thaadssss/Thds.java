package Thaadssss;

public class Thds  extends Thread {
	
	

	Thds(){
		start();
		
	}
	public void  run() {
		
		try {
		for(int i=0;i<5;i++){
			System.out.println("thread---->"+i);	
			
				Thread.sleep(1000);
		}
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		System.out.println("EXiT");
		
	}

}
