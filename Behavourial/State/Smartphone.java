package Behavourial.State;

public class Smartphone {
    private PhoneState currentState;

    public Smartphone(PhoneState state){
        this.currentState = state;
    }
    public void setPhoneState(PhoneState state){
        this.currentState = state;
    }
    public void pressButton(){
        currentState.pressButton();
    }
}
