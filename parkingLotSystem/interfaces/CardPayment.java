package interfaces;
public class CardPayment implements Payment{
    @Override 
    public void pay(double amount){
        System.out.println("Paid : "+ amount+"rs using Card.");
    }
}
