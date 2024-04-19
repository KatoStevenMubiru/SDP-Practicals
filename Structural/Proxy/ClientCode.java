package Proxy;

/**
 * ClientCode
 */
public class ClientCode {

    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount(10000);
        Payment paymentMethod = new CreditCard(bankAccount);

        paymentMethod.pay(3000);
        paymentMethod.pay(6000);
    }
}