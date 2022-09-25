public class App {
    public static void main(String[] args) throws Exception {
       // Products product = new Products(1,"Laptop", "Asus Laptop", 5000, 3, "Siyah", null);


       Products product = new Products();
       
        product.setName("Laptop");
        product.setId(1);
        product.setDescription("Asus Laptop");
        product.setPrice(5000);
        product.setStockAmount(3);
        

        ProductManager productManager = new ProductManager();
        productManager.Add(product);

        System.out.println(product.getKod());

    }
}
