package Behavourial.Strategy;

public class Navigator {
    private RouteStrategy strategy;

    public Navigator(RouteStrategy strategy){
        this.strategy = strategy;
    }
    
}
