package Behavourial.ChainOfResponsibility;

public class SpamHandler implements Handler{
    private Handler nextHandler;

    @Override
    public void setNext(Handler handler){
        this.nextHandler = handler;
    }
    @Override
    public void handle(String message){
         if(message.contains("spam"){
            System.out.println("SpamHandler: This message is spam .");
         })
    }
    
}
