public class Main {
    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle();
        vehicle.serialNumber = "96325";
        vehicle.name = "Honda";
        vehicle.model = "City";
        vehicle.year = 2019;
        vehicle.manufacturer = "Honda";
        vehicle.baseCost = 259999.00;

        vehicle.displayInfo();
    }
}
