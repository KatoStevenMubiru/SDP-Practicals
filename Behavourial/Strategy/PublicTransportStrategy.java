package Behavourial.Strategy;

public class PublicTransportStrategy implements RouteStrategy {
    public void buildRoute(String origin, String destination){
         System.out.println("Building a public transport route from " + origin + " to " + destination);

    }
    
}
