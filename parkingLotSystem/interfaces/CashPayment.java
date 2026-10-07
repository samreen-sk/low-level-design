package interfaces;
public class CashPayment implements Payment {
    @Override 
    public void pay(double amount){
        System.out.println("Paid : "+ amount+"rs using Cash.");
    }
}
