package SOLID.OpenClosed;

/**
 * Order
 */
public class Order {

    private double weight;

    public Order(double weight){
        this.weight = weight;
    }

    public double calculateShippingCost(){
        //Hardcoded shipping logic

        if(weight < 5){
            return 10;
        } else{
            return weight * 2;
        }
    }
}