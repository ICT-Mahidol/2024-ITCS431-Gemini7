class Vehicle {
    String serialNumber;
    String name;
    String model;
    int year;
    String manufacturer;
    double baseCost;

    public void displayInfo() {
        System.out.println("Vehicle Information:");
        System.out.println("Serial Number: " + serialNumber);
        System.out.println("Name: " + name);
        System.out.println("Model: " + model);
        System.out.println("Year: " + year);
        System.out.println("Manufacturer: " + manufacturer);
        System.out.println("Base Cost: $" + baseCost);
    }
}
