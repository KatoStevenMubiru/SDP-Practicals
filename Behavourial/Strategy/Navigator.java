package Behavourial.Strategy;

public class Navigator {
    private RouteStrategy strategy;

    public Navigator(RouteStrategy strategy){
        this.strategy = strategy;
    }
    public void setStrategy(RouteStrategy strategy){
        this.strategy = strategy;
    }
    public void buildRoute(String origin, String destination){
        strategy.buildRoute(origin, destination);
    }
}
