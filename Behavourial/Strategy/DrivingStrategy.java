package Behavourial.Strategy;

public class DrivingStrategy implements RouteStrategy {
    public void buildRoute(String origin, String destination){
        System.out.println("Building a driving route from " + origin + " to " + destination);
    }
    
}
