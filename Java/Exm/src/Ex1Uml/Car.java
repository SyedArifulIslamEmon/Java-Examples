package Ex1Uml;

public   class Car extends Vehical implements Drive,Service{

	public Car(double weight) {
		super(weight);
		
	}

	@Override
	public void start() {
		System.out.println("======= START ========");
		
	}

	@Override
	public void stop() {
	 
		System.out.println("========== STOP =======");
		
	}

	@Override
	public void maintain() {
		// TODO Auto-generated method stub
		System.out.println("======= Maintain ========");
	}

	@Override
	public void dispaly() {
		System.out.println("Weight = "+weight);
		
	}

}
