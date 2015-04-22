package Thaadssss;

class NewThread implements  Runnable {
    Thread t;
	NewThread(){
	t=new Thread(this,"Demo thread");
//	System.out.println("child Thread: "+t);
	t.start();
	}
	public void run() {
		// TODO Auto-generated method stub
		
		
		for(int i=5;i>0;i--){
			System.out.println("child --->"+i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		System.out.println("chid thread exit");
	}
	
	
} 
