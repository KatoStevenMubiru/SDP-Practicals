package SOLID.OpenClosed.AfterOpenClosed.Closed;

/**
 * WeightBasedShipping
 */
public class WeightBasedShipping implements ShippingStrategy{
        
    public double calculate(double weight){
         
        return weight * 2;
    }
    
}