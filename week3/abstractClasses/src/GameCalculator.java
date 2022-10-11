public abstract class GameCalculator {
    //her classta tanımanmalı
    public abstract void hesapla();
    


    //override edilmez
    public final void gameOver(){
        System.out.println("Oyun bitti ");
    }

    
}
