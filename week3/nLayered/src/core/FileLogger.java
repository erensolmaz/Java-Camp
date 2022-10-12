package core;

public class FileLogger implements logger {

    @Override
    public void log(String data) {
        System.out.println("File logged: "+ data);
        
    }
    
    
}
