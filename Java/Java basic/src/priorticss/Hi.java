package priorticss;

public class Hi {
	public static void main (String args[]){
		Thread.currentThread().setPriority(Thread.MAX_PRIORITY);
		Clicker hi=new Clicker(Thread.NORM_PRIORITY-4);
		Clicker lo=new Clicker(Thread.NORM_PRIORITY-2);
		hi.s();
		lo.s();
		
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		lo.stop();
		hi.stop();
		
		try {
			hi.t.join();
			lo.t.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("low piroty---->"+lo.i);
		System.out.println("highpiroty---->"+hi.i);
		
		
	}

}
