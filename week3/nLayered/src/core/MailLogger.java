package core;

public class MailLogger implements logger {

    @Override
    public void log(String data) {
        System.out.println("Mail logged: "+ data);
        
    }
    
}
