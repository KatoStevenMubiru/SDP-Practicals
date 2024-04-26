package Behavourial.State;

public class StatePatternDemo {
    public static void main(String[] args) {
        Smartphone phone = new Smartphone(new LockedState());

        //Phone locked initially
        phone.pressButton();

        //change state to unlocked
        phone.setPhoneState(new UnlockedState());
        phone.pressButton();

        //change to low battery
        phone.setPhoneState(new LowBatteryState());
        phone.pressButton();
    }
    
}
