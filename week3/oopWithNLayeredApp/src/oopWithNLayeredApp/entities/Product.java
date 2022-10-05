package oopWithNLayeredApp.entities;

public class Product {
    private int id;
    private String name;
    private double unitPrice;
    /**
     * 
     */
    public Product() {
        super();
    }
    /**
     * @param id
     * @param name
     * @param unitPrice
     */
    public Product(int id, String name, double unitPrice) {
        this.id = id;
        this.name = name;
        this.unitPrice = unitPrice;
    }
    /**
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
     * @return the name
     */
    public String getName() {
        return name;
    }
    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }
    /**
     * @return the unitPrice
     */
    public double getUnitPrice() {
        return unitPrice;
    }
    /**
     * @param unitPrice the unitPrice to set
     */
    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }
    
    
}
