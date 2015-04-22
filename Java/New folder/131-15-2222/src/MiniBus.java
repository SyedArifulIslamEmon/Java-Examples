
public class MiniBus extends Car {
	
    private int gearnum;
    
    public MiniBus(String brand, String model, int numsheet, int gearnum) {
		super(brand, model, numsheet);
		this.gearnum = gearnum;
	}

	public MiniBus(int gearnum) {
		this.gearnum = gearnum;
	}

	public MiniBus() {
	
	}

	public int getGearnum() {
		return gearnum;
	}

	public void setGearnum(int gearnum) {
		this.gearnum = gearnum;
	}
}
