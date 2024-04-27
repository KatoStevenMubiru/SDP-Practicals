package Behavourial.Strategy;

public class StrategyDemo {
    public static void main(String[] args) {
        Navigator navigator = new Navigator(new DrivingStrategy());
        
        navigator.buildRoute("Home", "Office");
    }
    
}
