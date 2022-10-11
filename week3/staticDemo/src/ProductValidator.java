public class ProductValidator {

    static{
        System.out.println("Statik yapıcı blok çalıştı");
    }

    public ProductValidator(){
        System.out.println("XXX");
    }

    public static boolean isValid(Product product){
        if(product.price>0 && !product.name.isEmpty()){
            return true;

        }else{
            return false;
        }

    }
    public void bisey(){

    }


    }
    
//inner class