public class CustomerManager extends App {
    private Customer _customer;
    private iCreditManager _creditManager;
    public CustomerManager(Customer customer, iCreditManager creditManager){
        _customer = customer;
        _creditManager = creditManager;
    }

    public void Save(){
        System.out.println("Müşteri kaydedildi2 : ");
    }
    public void Delete(){
        System.out.println("Müşteri Silindi : ");
    }
    public void GiveCredit(){
        _creditManager.calculate();
        System.out.println("Kredi verildi");

    }


    
}
