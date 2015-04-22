package Tutorial;

public class Thd2 implements Runnable{
	Thread t;
	Thd2(){
		t=new Thread(this,"Demo thread");
		System.out.println("child thread "+t);
		t.start();
		
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		try{
			for(int i=5;i>0;i--){
				System.out.println("child :"+i);
				Thread.sleep(1000);
			}
			
		}catch(InterruptedException e){
			System.out.println("chil thread is interrupted");
			
		}
		System.out.println("exit thread ");
	}

}
