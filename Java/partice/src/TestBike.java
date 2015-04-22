
public class TestBike {
  public static void main(String[] args){
    

  Bicycle  bike01 = new Bicycle(20, 10, 1);
   Bicycle  bike02 = new MountainBike(20, 10, 5, "Dual");
  Bicycle  bike03 = new RoadBike(40, 20, 8, 23);

    bike01.printDescription();
    bike02.printDescription();
    bike03.printDescription();
  }
}

