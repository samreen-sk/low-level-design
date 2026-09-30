package service;

import model.bankAccountModel;
import model.currentAccountModel;
import model.savingsAccountModel;
import repository.accountRepository;

public class accountService {
    private accountRepository accrepo;

    public accountService(accountRepository accrepo) {
        this.accrepo = accrepo;
    }
    
    public void createSavingsAccount(String accno, String name, double initialBalance){
        if(accrepo.exits(accno)){
            throw new IllegalArgumentException("Account already existed.");
        }
        savingsAccountModel savingacc = new savingsAccountModel(accno,name,initialBalance,1000);
        accrepo.save(savingacc);
    }

    public void createCurrentAccount(String accno, String name, double initialBalance){
        if(accrepo.exits(accno)){
            throw new IllegalArgumentException("Account already existed");
        }
        currentAccountModel currentacc = new currentAccountModel(accno,name,initialBalance,5000);
        accrepo.save(currentacc); 
    }

    public void deposit(String accNumber,double amount){
        bankAccountModel currentAccount = getAccount(accNumber);
        currentAccount.deposit(amount);
    }

    public void withdraw(String accNumber, double amount){
        bankAccountModel currentAccount = getAccount(accNumber);
        currentAccount.withdraw(amount);
    }

    public bankAccountModel getAccount(String accNumber){
        bankAccountModel account = accrepo.find(accNumber);
        if(account==null){
            throw new IllegalArgumentException("Account not found");
        }
        return account;
    }
}
