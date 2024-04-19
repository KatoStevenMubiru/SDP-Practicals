package Proxy;

/**
 * CreditCard
 */
public class CreditCard  implements Payment{
    private BankAccount bankAccount;

    public CreditCard(BankAccount bankAccount){
        this.bankAccount = bankAccount;
    }

    
}