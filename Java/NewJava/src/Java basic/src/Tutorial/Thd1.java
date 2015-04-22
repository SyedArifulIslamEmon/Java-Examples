package Tutorial;


class Thd1{
	public static void main (String args[]){
		new Thd2();
		try {
			
			for(int i=5;i>0;i--){
				
				System.out.println("main thread"+i);
				Thread.sleep(500);
			}
		}catch(InterruptedException e){
			
			System.out.println("main thread intrupcd");
		}
		System.out.println("exitttttttttt");
	}
	
}