import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        String cevap1, cevap2;
        cevap1 = sc.next();
        cevap2 = sc.next();
        kullanici login = new kullanici("eren", "solmaz");
        if(login.id.equals(cevap1) && login.pw.equals(cevap2)){
            System.out.println("Giriş doğru");

        }
        else{
            System.out.println("Giriş hatalı");
        }

        
    }
}
