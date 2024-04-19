package Proxy;

public class BankAccount implements Payment {
   private int balance;

   public BankAccount(int initialBalance){
    this.balance = initialBalance;
   }
    
   @Override
   public void pay(int amount){
    if(balance >= amount){
        balance -= amount;
        System.out.println("Paid " + amount + " using bank account. Remaining balance: " + balance);
    } else{
        System.out.println("Insufficient funds in the bank account");
    }
   }
}