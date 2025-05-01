public class Customer extends Person{
    private String CustomerID;
    private int MembershipLevel;


    public Customer(String name, String address, String phone, String CustomerID, int membershipLevel) {
        super(name, address, phone);
        this.CustomerID = CustomerID;
        this.MembershipLevel = membershipLevel;
    }
    
    public String getCustomerID() {
        return CustomerID;
    }

    public void setCustomerID(String CustomerID) {
        this.CustomerID = CustomerID;
    }


    public int getMembershipLevel() {
        return MembershipLevel;
    }

    public void setMembershipLevel(int membershipLevel) {
        MembershipLevel = membershipLevel;
    }

    @Override
    public void getInvoice() {
        System.out.println("Invoice for Customer ID: " + CustomerID);
    }
    public void negotiateVehicle() {
        System.out.println("Negotiating vehicle price for Customer ID: " + CustomerID);
    }
    public void requestTradeIn() {
        System.out.println("Requesting trade-in for Customer ID: " + CustomerID);
    }

}
