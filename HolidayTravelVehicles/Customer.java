class Customer extends Person {
    private String customerID;
    private String membershipLevel;

    public Customer(String name, String address, String phoneNumber, String customerID, String membershipLevel) {
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.customerID = customerID;
        this.membershipLevel = membershipLevel;
    }

    public void getInvoice() {
        System.out.println("Fetching invoice for customer: " + name);
    }

    public void negotiateVehicle() {
        System.out.println("Negotiating vehicle price...");
    }

    public void requestTradein() {
        System.out.println("Requesting trade-in...");
    }
}