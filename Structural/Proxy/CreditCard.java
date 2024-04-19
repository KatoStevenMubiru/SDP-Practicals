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
            banl
        }
    }

    
}