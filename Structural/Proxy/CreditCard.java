package Proxy;

/**
 * CreditCard
 */
public class CreditCard  implements Payment{
    private BankAccount bankAccount;

    public CreditCard(BankAccount bankAccount){
        this.bankAccount = bankAccount;
    }

    @Override
    public void pay(int amount){
        if(hasSuffientCreditLimit(amount)){
            bankAccount.pay(amount);
        } else{
            System.out.println("Payment declined: Credit limit exceeded.");
        }
    }
    private boolean hasSuffientCreditLimit(int amount){
        return amount <= 7000;
    }
    
}