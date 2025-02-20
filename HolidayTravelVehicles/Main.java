public class Main {
    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle();
        vehicle.serialNumber = "84562";
        vehicle.name = "Honda";
        vehicle.model = "Civic";
        vehicle.year = 2022;
        vehicle.manufacturer = "Honda";
        vehicle.baseCost = 25999.00;

        vehicle.displayInfo();
    }
}
