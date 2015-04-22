package Thaadssss;

 class Ethread extends Thread {
  Ethread(){
	  super("demo thread");
	  System.out.println("child Thread : "+this);
	  start();
  }
public void run(){
	
	try {
		for(int i=5;i>0;i--){
			System.out.println("child--->"+i);
			Thread.sleep(500);
		}
		
	} catch (Exception e) {
		// TODO: handle exception
	}
	System.out.println("child thread is exit........");
}

}
