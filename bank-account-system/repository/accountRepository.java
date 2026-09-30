package repository;

import model.bankAccountModel;

import java.util.*;
public class accountRepository {
    Map<String, bankAccountModel> accounts = new HashMap<>();

    public void save(bankAccountModel acc){
        accounts.put(acc.getBankAcc(),acc);
    }
    public bankAccountModel find(String accNum){
        return accounts.get(accNum);
    }
    public void delete(String accNum){
        accounts.remove(accNum);
    }
    public boolean exits(String accNum){
        return accounts.containsKey(accNum);
    }
}
