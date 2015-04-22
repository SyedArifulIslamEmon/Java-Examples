package Thaadssss;

public class HiLo {
	public static void main (String args[]){
		Thread.currentThread().setPriority(Thread.MAX_PRIORITY);
		clicker hi=new clicker(Thread.NORM_PRIORITY+2);
		clicker lo=new clicker(Thread.NORM_PRIORITY-2);
		lo.start();
		hi.start();
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		};
		
	
   lo.stop();
   hi.stop();
   
	   
	   
	   try {
		lo.t.join();
		hi.t.join();
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	   System.out.println("low thread---->"+lo.click);
       System.out.println("high thread--->"+hi.click);
	}
}
