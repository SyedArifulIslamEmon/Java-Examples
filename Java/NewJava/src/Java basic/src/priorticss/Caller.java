package priorticss;

class Caller implements Runnable{

	
	String msg;
	Callme target;
	Thread t;
	Caller (Callme targ,String a){
		target =targ;
		msg= a;
		t=new Thread(this);
		t.start();
		
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		//synchronized (target) {
			target.call(msg);
		//}
	}
	
	
}
