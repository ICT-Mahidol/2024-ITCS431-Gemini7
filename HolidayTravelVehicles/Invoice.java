class Invoice {
    private String invoiceNumber;
    private String date;
    private double tradeInAllowance;
    private double taxes;
    private double licenseFees;
    private String customerSignature;

    public Invoice(String invoiceNumber, String date, double tradeInAllowance, double taxes, double licenseFees, String customerSignature) {
        this.invoiceNumber = invoiceNumber;
        this.date = date;
        this.tradeInAllowance = tradeInAllowance;
        this.taxes = taxes;
        this.licenseFees = licenseFees;
        this.customerSignature = customerSignature;
    }

    public void requestDealerInstallOptions() {
        System.out.println("Dealer-installed options requested for Invoice: " + invoiceNumber);
    }
    public void sumFinalNegotiatedPrice() {
        double finalPrice = tradeInAllowance + taxes + licenseFees;
        System.out.println("Final negotiated price: " + finalPrice);
    }

    public String getInvoiceNumber() {
        return invoiceNumber;
    }

    public void setInvoiceNumber(String invoiceNumber) {
        this.invoiceNumber = invoiceNumber;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public double getTradeInAllowance() {
        return tradeInAllowance;
    }

    public void setTradeInAllowance(double tradeInAllowance) {
        this.tradeInAllowance = tradeInAllowance;
    }

    public double getTaxes() {
        return taxes;
    }

    public void setTaxes(double taxes) {
        this.taxes = taxes;
    }

    public double getLicenseFees() {
        return licenseFees;
    }

    public void setLicenseFees(double licenseFees) {
        this.licenseFees = licenseFees;
    }

    public String getCustomerSignature() {
        return customerSignature;
    }

    public void setCustomerSignature(String customerSignature) {
        this.customerSignature = customerSignature;
    }

}