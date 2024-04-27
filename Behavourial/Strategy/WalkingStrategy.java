package Behavourial.Strategy;

public class WalkingStrategy implements RouteStrategy {
    public void buildRoute(String origin, String destination){
        System.out.println("Building a walking route from " + origin + " to " + destination);
    }
    
}
