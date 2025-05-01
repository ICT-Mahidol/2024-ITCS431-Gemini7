public class Person {
    private String Name;
    private String Address;
    private String Phone;

    public Person(String name, String address, String phone) {
        this.Name = name;
        this.Address = address;
        this.Phone = phone;
    }

    public Person() {
        Name = "";
        Address = "";
        Phone = "";
    }

    public String getName() {
        return Name;
    }
    public void setName(String name) {
        Name = name;
    }
    public String getAddress() {
        return Address;
    }
    public void setAddress(String address) {
        Address = address;
    }
    public String getPhone() {
        return Phone;
    }
    public void setPhone(String phone) {
        Phone = phone;
    }

    public void getInvoice(){

    }
    
}
