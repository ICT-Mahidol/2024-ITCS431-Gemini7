class Vehicle {
    private String vehicleSerialNumber;
    private String name;
    private String model;
    private int year;
    private String manufacturer;
    private double baseCost;

    public Vehicle(String vehicleSerialNumber, String name, String model, int year, String manufacturer,
            double baseCost) {
        this.vehicleSerialNumber = vehicleSerialNumber;
        this.name = name;
        this.model = model;
        this.year = year;
        this.manufacturer = manufacturer;
        this.baseCost = baseCost;
    }

    public void createNewVehicleRecord() {
        System.out.println("Creating new vehicle record...");
    }

    public void displayInfo() {
        System.out.println("Vehicle Details:");
        System.out.println("Serial Number: " + vehicleSerialNumber);
        System.out.println("Name: " + name);
        System.out.println("Model: " + model);
        System.out.println("Year: " + year);
        System.out.println("Manufacturer: " + manufacturer);
        System.out.println("Base Cost: " + baseCost);
    }
}