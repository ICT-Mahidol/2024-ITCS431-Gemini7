public class Main {
    public static void main(String[] args) {
        Customer customer = new Customer("Sittikorn Maneewong", "123 Street", "0804796695", "C001", 2);
        Salesperson salesperson = new Salesperson("Monbiew", "456 Avenue", "0846413669", "S001", 50000, "Manager");
        Vehicle vehicle = new Vehicle("V001", "Toyota", "Camry", 2022, "Toyota", 25000);
        Invoice invoice = new Invoice("INV1001", "2025-02-19", 2000, 500, 300, "John Doe");
        
        customer.getInvoice();
        customer.negotiateVehicle();
        customer.requestTradeIn();
        
        salesperson.createInvoice();
        salesperson.negotiateVehicle();
        
        vehicle.createNewVehicleRecord();
        
        invoice.requestDealerInstallOptions();
        invoice.sumFinalNegotiatedPrice();
    }
}
