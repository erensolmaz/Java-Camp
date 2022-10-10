import java.lang.System.Logger;

public class App {
    public static void main(String[] args) throws Exception {
      /*   BaseLogger[] loggers = new BaseLogger[]{new DatabaseLogger(), new EmailLogger(), new FileLogger(), new ConsoleLogger()};
       for(BaseLogger logger:loggers){
        logger.Log(" = Log mesajı");
        }
        */

        CustomerManager customerManager = new CustomerManager(new FileLogger());
        customerManager.add();


    

}
}
