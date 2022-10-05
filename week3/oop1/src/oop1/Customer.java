package oop1;

public class Customer {
    private int id;
    private String customerNumber;
    private String phone;
    /** source>generate get and set ile hızlı şekilde tanımayabilirsiniz.
     * @return the id
     */
    public int getId() {
        return id;
    }
    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }
    /**
     * @return the customerNumber
     */
    public String getCustomerNumber() {
        return customerNumber;
    }
    /**
     * @param customerNumber the customerNumber to set
     */
    public void setCustomerNumber(String customerNumber) {
        this.customerNumber = customerNumber;
    }
    /**
     * @return the phone
     */
    public String getPhone() {
        return phone;
    }
    /**
     * @param phone the phone to set
     */
    public void setPhone(String phone) {
        this.phone = phone;
    }
}
