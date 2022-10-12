package core;

public class DatabaseLogger implements logger {

    @Override
    public void log(String data) {
        System.out.println("Database Logged: "+ data);
        
    }
    
}
