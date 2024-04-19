package Proxy;

public class BankAccount implements Payment {
   private int balance;

   public BankAccount(int initialBalance){
    this.balance = initialBalance;
   }
    
}