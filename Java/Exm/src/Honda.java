
public class Honda extends Vehicle implements Drive {

	private int nowheel;
	private double price;

	public Honda(String model, double weight, int nowheel, double price) {
		super(model, weight);
		this.nowheel = nowheel;
		this.price = price;
	}

	@Override
	public void drive() {
		
		System.out.println("======= Drive ======");
	}

	@Override
	public void stop() {
		System.out.println("===== Stop ======");
		
	}
	public static void main (String args[]){
		
		
		Honda ob=new Honda("Hunk",45,5,200000);
		ob.dispaly();
	}

}
