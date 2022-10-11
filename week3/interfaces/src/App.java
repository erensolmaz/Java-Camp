public class App {
    public static void main(String[] args) throws Exception {
        CustomerManager customerManager = new CustomerManager(new SqlCustomerDal());
        customerManager.add();
            
        };
    }
