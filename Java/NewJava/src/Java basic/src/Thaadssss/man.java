package Thaadssss;

public class man {
	public static void main(String args[]){
		
		
		A n=new A("Thread 1");
		A m=new A("Thread 2");
		A o=new A("Thread 3");
		try {
			n.join();
			m.join();
			o.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
