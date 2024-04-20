package Behavourial.ChainOfResponsibility;

import java.security.DrbgParameters.NextBytes;

public class ComplaintHandler implements Handler{
     public Handler nexHandler;
     
     @Override
     public void setNext(Handler handler){
        this.nexHandler = handler;
     }

     @Override
     public void handle(String message){
        if(message.contains("complaint")){
            System.out.println("ComplaintHandler: Handling a complaint");
        } else if(nexHandler != null){
            nextHandler.handle(message);
        }
     }
    
}
