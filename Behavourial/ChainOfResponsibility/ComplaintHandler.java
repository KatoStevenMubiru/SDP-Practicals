package Behavourial.ChainOfResponsibility;

public class ComplaintHandler implements Handler{
     public Handler nexHandler;
     
     @Override
     public void setNext(Handler handler){
        this.nexHandler = handler;
     }

     @Override
     public 
    
}
