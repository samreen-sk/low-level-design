    package model;

    public class savingsAccountModel extends bankAccountModel {
        private double minBalance;

        public savingsAccountModel(String bankAcc, String accHolderName, double balance, double minBalance) {
            super(bankAcc, accHolderName, balance);
            this.minBalance = minBalance;
        }
        @Override 
        public void withdraw(double amount){
            if(amount<=0){
                throw new IllegalArgumentException("Invalid amount.");
            }
            if(getBalance()-amount<minBalance){
                throw new IllegalArgumentException("Insufficient Amount");
            }
            setBalance(getBalance()-amount);
        }
        public double getMinBalance(){
            return minBalance;
        }
    }
