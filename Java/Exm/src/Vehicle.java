
public class Vehicle {
	protected String model;
	protected double weight;
	
	public Vehicle(String model, double weight) {
		
		this.model = model;
		this.weight = weight;
	}
	public void dispaly(){
		
		
		System.out.println("Model-->"+model+"\n Weight -->"+weight);
	}
	

}
