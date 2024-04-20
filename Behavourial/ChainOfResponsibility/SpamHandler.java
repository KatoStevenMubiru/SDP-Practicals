package Behavourial.ChainOfResponsibility;

public class SpamHandler implements Handler{
    private Handler nextHandler;

    @Override
    public void setNext(Handler handler){
        
    }
    
}
