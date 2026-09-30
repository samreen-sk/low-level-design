package model;

public class currentAccountModel extends bankAccountModel {
    double limit;

    public currentAccountModel(String bankAcc, String accHolderName, double balance,double limit) {
        super(bankAcc, accHolderName, balance);
        this.limit = limit;
    }
    @Override 
    public void withdraw(double amount){
        if(amount<=0){
            throw new IllegalArgumentException("Invalid amount.");
        }
        if(getBalance()-amount<limit){
            throw new IllegalArgumentException("Insufficient Amount");
        }
        setBalance(getBalance()-amount);
    }
    public double getLimit(){
        return limit;
    }
}
