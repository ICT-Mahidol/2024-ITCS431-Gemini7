class Invoice {
    private String invoiceNumber;
    private String date;
    private double tradeInAllowance;
    private double taxes;
    private double licenseFees;
    private String customerSignature;
    
    public void requestDealerInstallOptions() {
        System.out.println("Requesting dealer-installed options...");
    }
    
    public void sumFinalNegotiatedPrice() {
        System.out.println("Summing final price...");
    }
}