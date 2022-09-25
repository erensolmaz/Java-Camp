public class App {
    public static void main(String[] args) throws Exception {
        CustomerManager customerManager = new CustomerManager(); //classı çağır
        CustomerManager customerManager2 = new CustomerManager();
        customerManager = customerManager2;
        customerManager.Add();
        customerManager.Remove();
        customerManager.Update();
      
    }
}
