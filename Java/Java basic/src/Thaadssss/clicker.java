package Thaadssss;

public class clicker implements Runnable{
	 int click=0;
	 Thread t;
	  boolean running =true;
	public  clicker(int p){
		Thread t = new Thread(this); 
		t.setPriority(p); 
	 }
	public void run() {
		while(running){
			click++;
			
		}
	}
	 void stop(){
		
		running =false;
	}
	public void start() {
		t.start();
	}
 }
