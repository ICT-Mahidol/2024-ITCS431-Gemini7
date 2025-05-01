public class Salesperson extends Person{
    private String SalePersonID;
    private double Salary;
    private String Position;

    public Salesperson(String Name, String Address ,String Number,String SalePersonID, double Salary, String Position){
        super(Name, Address, Number);
        this.SalePersonID = SalePersonID;
        this.Salary = Salary;
        this.Position = Position;
    }

    public Salesperson(String Name, String Address ,String Number){
        super(Name, Address, Number);
    }

    public Salesperson(String SalePersonID, double Salary, String Position){
        this.SalePersonID = SalePersonID;
        this.Salary = Salary;
        this.Position = Position;
    }

    public String getSalePersonID() {
        return SalePersonID;
    }

    public void setSalePersonID(String SalePersonID) {
        this.SalePersonID = SalePersonID;
    }

    public double getSalary() {
        return Salary;
    }

    public void setSalary(double Salary) {
        this.Salary = Salary;
    }

    public String getPosition() {
        return Position;
    }

    public void setPosition(String Position) {
        this.Position = Position;
    }

    public void createInvoice() {
        System.out.println("Creating invoice by Salesperson ID: " + SalePersonID);
    }
    public void negotiateVehicle() {
        System.out.println("Negotiating vehicle price by Salesperson ID: " + SalePersonID);
    }
    
}
