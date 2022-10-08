public abstract class BaseCreditManager implements iCreditManager {


    public abstract void calculate();

    @Override
    public void save() {
        System.out.println("Kaydedildi.");
    }

    
}
