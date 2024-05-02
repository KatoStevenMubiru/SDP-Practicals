package SOLID.OpenClosed.AfterOpenClosed.Closed;

/**
 * Main
 */
public class Main {

    public static void main(String[] args) {
        Order order = new Order(10, new WeightBasedShipping());
        System.out.println("Shipping cost: " + order.calculateShippingCost());
    }
}