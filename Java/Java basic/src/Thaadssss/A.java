package Thaadssss;

public class A extends Thread {
	A(String t){
		super (t);
		start();
	}

	public void run() {
		try {
			System.out.println("Thread::::::" + getName() + "started");
			for (int i = 0; i < 5; i++) {
				System.out.println("Thread" + getName() + "value--->" + i);
				Thread.sleep(1000);
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
			
		System.out.println("thread"+getName()+"finish");	
		
	}
     
}
