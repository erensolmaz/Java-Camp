public class App {
    public static void main(String[] args) throws Exception {
        WomanGameCalculator wgc = new WomanGameCalculator();
        wgc.gameOver();
        wgc.hesapla();
        KidsGameCalculator kgc = new KidsGameCalculator();
        kgc.hesapla();


        GameCalculator gameCalculator = new KidsGameCalculator();
        gameCalculator.gameOver();
    }
}
