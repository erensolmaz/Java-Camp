package oop1;

public class Product {
    String name;
    double unitPrice;
    double discount;
    String imageUrl;
    int unitsInStock;
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
    /**
     * @return the discount
     */
    public double getDiscount() {
        return discount;
    }
    /**
     * @param discount the discount to set
     */
    public void setDiscount(double discount) {
        this.discount = discount;
    }
    /**
     * @return the imageUrl
     */
    public String getImageUrl() {
        return imageUrl;
    }
    /**
     * @param imageUrl the imageUrl to set
     */
    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }
    /**
     * @return the unitsInStock
     */
    public int getUnitsInStock() {
        return unitsInStock;
    }
    /**
     * @param unitsInStock the unitsInStock to set
     */
    public void setUnitsInStock(int unitsInStock) {
        this.unitsInStock = unitsInStock;
    }
}