package Behavourial.ChainOfResponsibility;

public class Client {
    public static void main(String[] args){
        Handler spam = new SpamHandler();
        Handler fan = new FanMailHandler();
        Handler complaint = new ComplaintHandler();

        spam.setNext(fan);
        fan.setNext(complaint);
        complaint.setNext(spam);

        spam.handle("This is a spam message .");
        spam.handle("I really love the product");
        spam.handle("I have a complaint about my last order");
    }
    
}
