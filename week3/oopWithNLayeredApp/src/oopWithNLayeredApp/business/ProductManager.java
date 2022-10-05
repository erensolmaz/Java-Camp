package oopWithNLayeredApp.business;

import java.util.List;
import java.util.jar.Attributes.Name;

import oopWithNLayeredApp.core.logging.Logger;
import oopWithNLayeredApp.dataAccess.HibernateProductDao;
import oopWithNLayeredApp.dataAccess.JdbcProductDao;
import oopWithNLayeredApp.dataAccess.ProductDao;
import oopWithNLayeredApp.entities.Product;

public class ProductManager {
    private ProductDao productDao;
    private List<Logger> loggers;

    public ProductManager(ProductDao productDao, Logger[] loggers2) {
        this.productDao = productDao;
        this.loggers = loggers;

    }



    public void add(Product product) throws Exception{

        if(product.getUnitPrice()<10){
            throw new Exception("Ürün fiyatı 10 dan küçük olamaz.");
            
        }

       
        productDao.add(product);

        for (Logger logger : loggers) {
            logger.log(product.getName());
            
        }

    }
}
