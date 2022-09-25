public class Products {

    public Products(int id, String name, String description, double price, int stockAmount, String renk, String kod){
        System.out.println("Yapıcı blok çalıştı");
        this.id= id;
        this.renk =renk;
        this.name = name;
        this.price = price;
        this.description = description;
        this.stockAmount = stockAmount;

    }

    public Products(){
        System.out.println("Yapıcı blok çalıştı");
    }

    private int id;
    private String name;
    private String description;
    private double price;
    private int stockAmount;
    private String renk;
    private String kod;

    public int getId() {
        return id;
    }

    public void setID(int id) {
        this.id = id;
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
     * @return the description
     */
    public String getDescription() {
        return description;
    }

    /**
     * @param description the description to set
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * @return the price
     */
    public double getPrice() {
        return price;
    }

    /**
     * @param price the price to set
     */
    public void setPrice(double price) {
        this.price = price;
    }

    /**
     * @return the stockAmount
     */
    public int getStockAmount() {
        return stockAmount;
    }

    /**
     * @param stockAmount the stockAmount to set
     */
    public void setStockAmount(int stockAmount) {
        this.stockAmount = stockAmount;
    }

    /**
     * @return the renk
     */
    public String getRenk() {
        return renk;
    }

    /**
     * @param renk the renk to set
     */
    public void setRenk(String renk) {
        this.renk = renk;
    }

    /**
     * @return the kod
     */
    public String getKod() {
        return this.name.substring(0,1) +id;
    }

    /**
     * @param kod the kod to set
     */
    public void setKod(String kod) {
        this.kod = kod;

        }
}
