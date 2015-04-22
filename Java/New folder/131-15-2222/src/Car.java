
public class Car {
	private String brand ;
	private String model;
	private int numsheet;
	
	public Car() {
		
	}
	public Car(String brand, String model, int numsheet) {
		
		this.brand = brand;
		this.model = model;
		this.numsheet = numsheet;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public int getNumsheet() {
		return numsheet;
	}
	public void setNumsheet(int numsheet) {
		this.numsheet = numsheet;
	}
	
}
