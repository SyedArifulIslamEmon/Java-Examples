
public class Truck extends Car {
	private int loadCapacity;
	
	public Truck(String brand, String model, int numsheet, int loadCapacity) {
		super(brand, model, numsheet);
		this.loadCapacity = loadCapacity;
	}
	public Truck() {
		
	}
	public Truck(int loadCapacity) {
		
		this.loadCapacity = loadCapacity;
	}
	public int getLoadCapacity() {
		return loadCapacity;
	}
	public void setLoadCapacity(int loadCapacity) {
		this.loadCapacity = loadCapacity;
	}
	
}
