package Behavourial.ChainOfResponsibility;

public class Client {
    public static void main(String[] args){
        Handler spam = new SpamHandler();
        Handler fan = new FanMailHandler();
        Handler complaint = new ComplaintHandler();

        spam.setNext(fan);
        fan.setNext(complaint);
        complaint.setNext(spam);

        sp
    }
    
}