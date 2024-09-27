package model;
import java.util.ArrayList;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Yulun Feng
 */
public class AccountDirectory {
    
    private ArrayList<Account> accounts;
    
    public AccountDirectory(){
        this.accounts = new ArrayList<Account>();
    }
    
    public ArrayList<Account> getAccount(){
        return accounts;
    }
    
    public void setAccounts(ArrayList<Account> accounts){
        this.accounts = accounts;
    }
    
    public Account addAccount(){
        Account a = new Account();
        accounts.add(a);
        return a;
    }
    
    public Account searchAccount(String accountNumber){
        for(Account account:accounts){
            if(account.getAccountNumber().contains(accountNumber)){
                return account;
            }
        }
        return null;
    }
    
    public void deleteAccount(Account account){
        accounts.remove(account);
    }
    
}
