public class App {
    public static void main(String[] args) throws Exception {
        
       

        int sayi1 = 10;
        int sayi2 = 20;
        sayi1 = sayi2;
        sayi2 = 100; 

        System.out.println("Sayi 1: " + sayi1); 

        int[] sayilar1 = {1,2,3};
        int[] sayilar2 = {10,20,30};
        sayilar1 = sayilar2;

        sayilar2[0]=1000;

        System.out.println("sayilar 1 : " + sayilar1[0]);

    }
}
