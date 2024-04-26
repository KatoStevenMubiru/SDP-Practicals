package Behavourial.State;

public class UnlockedState implements PhoneState {
    public void pressButton(){
        System.out.println("The phone is unlocked. Pressing the button opens the home screen.");
    }
    
}
