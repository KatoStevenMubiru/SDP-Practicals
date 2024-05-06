package SOLID.OpenClosed.AfterOpenClosed.Closed;

/**
 * Order
 */
public class Order {

    private double weight;
    private ShippingStrategy shippingStrategy;

    public Order(double weight, ShippingStrategy strategy){
        this.weight = weight ;
        this.shippingStrategy = strategy;
    }

    public double calculateShippingCost(){
        return shippingStrategy.calculate(weight);
    }
}