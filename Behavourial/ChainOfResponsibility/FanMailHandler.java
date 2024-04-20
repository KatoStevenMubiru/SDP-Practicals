package Behavourial.ChainOfResponsibility;

public class FanMailHandler implements Handler{
    private Handler nextHandler;

    @Override
    public void setNext(Handler handler){
        this.nextHandler = handler;
    }

    @Override
    public void handle(String message){
        if(message.contains("love")){
            System.out.println("FanMailHandler: Handling fan mail.");
        } else if(nextHandler != null){
            nextHandler.handle(message);
        }
    }
    
}
