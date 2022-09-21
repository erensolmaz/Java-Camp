
package oop1;
public class Main {
    public static void main(String[] args){
        String mesaj = "Vade oranı";
        
        Product product1 = new Product();
        /*source>generate get and set ile hızlı şekilde tanımayabilirsiniz.*/
        product1.setName("Delgi Kahve Makinesi");
        product1.setDiscount(7);
        product1.setUnitPrice(7500);
        product1.setUnitsInStock(3);
        product1.setImageUrl("image.jpg");
        
        Product product2 = new Product();

        product2.setName("Legedi Kahve Makinesi");
        product2.setDiscount(3);
        product2.setUnitPrice(5000);
        product2.setUnitsInStock(35);
        product2.setImageUrl("imaege.jpg");

        Product product3 = new Product();
        product3.setName("Dedo Kahve Makinesi");
        product3.setDiscount(7);
        product3.setUnitPrice(700);
        product3.setUnitsInStock(6);
        product3.setImageUrl("imagee.jpg");


        Product[] products = {product1, product2, product3};

        //"for" sırayla productları gezer 1,2,3
        for (Product product : products) {
            System.out.println(product.getName());
        }
        IndividualCustomer individualCustomer = new IndividualCustomer ();
        individualCustomer.setId(1);
        individualCustomer.setPhone("053252353");
        individualCustomer.setCustomerNumber("12345");
        individualCustomer.setFirstName("firstName");
        individualCustomer.setLastName("lastName");

        CorporateCustomer corporateCustomer = new CorporateCustomer();
        corporateCustomer.setId(2);
        corporateCustomer.setPhone("phone");
        corporateCustomer.setCustomerNumber("cust");
        corporateCustomer.setCompanyName("name");
        corporateCustomer.setTaxNumber("taxNumber");

        Customer[] customers = {individualCustomer, corporateCustomer};
    }
}
