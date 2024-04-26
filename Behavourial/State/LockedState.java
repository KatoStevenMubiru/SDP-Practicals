package Behavourial.State;

public class LockedState implements PhoneState{
    public void pressButton(){
        System.out.println("The phone is locked. Pressing the button opens the unlock screen.");
    }
}
