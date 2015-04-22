package priorticss;

public class Clicker implements Runnable  {
	long i=0;
	Thread t;
	 boolean running =true;
	Clicker(int p){
		t=new Thread(this);
		t.setPriority(p);
		
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		while (running) {
			i++;
		}
	}
	public void stop(){
		running=false;
		
	}
	public void s(){
		
		t.start();
	}

}

