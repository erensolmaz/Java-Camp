package oop1;

public class CorporateCustomer extends Customer {
    private String companyName;
    private String taxNumber;
    /** diger classtan veri aldık customer
     * @return the companyName
     */
    public String getCompanyName() {
        return companyName;
    }
    /**
     * @param companyName the companyName to set
     */
    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }
    /**
     * @return the taxNumber
     */
    public String getTaxNumber() {
        return taxNumber;
    }
    /**
     * @param taxNumber the taxNumber to set
     */
    public void setTaxNumber(String taxNumber) {
        this.taxNumber = taxNumber;
    }
    
}
