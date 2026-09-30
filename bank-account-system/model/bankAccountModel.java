package model;

public abstract  class bankAccountModel {
    private String bankAcc;
    private String accHolderName;
    private double balance;

    public bankAccountModel(String bankAcc, String accHolderName, double balance) {
        this.bankAcc = bankAcc;
        this.accHolderName = accHolderName;
        this.balance = balance;
    }

    public double getBalance(){
        return balance;
    }

    public String getBankAcc(){
        return bankAcc;
    }

    public void deposit(double amount){
        if(amount<=0){
            throw new IllegalArgumentException("Invalid Input.");
        }
        balance+=amount;
    }
    public abstract void withdraw(double amount);

    public void setBalance(double amount){
        if(amount<=0){
            throw new IllegalArgumentException("amount is negative");
        }
        balance = amount;
    }
    
}
