
public class CarTest {

	public static void main(String[] args) {
		System.out.println("------------- Car -----------");
		Car car = new Car();
        car.setBrand("Honda");
        System.out.println("Brand = " + car.getBrand());
        System.out.println("------------- TRUCK -----------");
        Truck truck = new Truck();
        truck.setBrand("Ford");
        System.out.println("Brand = " + truck.getBrand());
        truck.setLoadCapacity(100);
        System.out.println("Load Capacity = "+truck.getLoadCapacity()+"Kg");
        System.out.println("------------------ BUS ----------------");
        MiniBus bus = new MiniBus();
        bus.setBrand("Desh");
        System.out.println("Brand = " + bus.getBrand());
        bus.setNumsheet(50);
        System.out.println("Sheet = "+bus.getNumsheet());
        

	}

}
