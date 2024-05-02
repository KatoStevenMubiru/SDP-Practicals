package SOLID.OpenClosed.AfterOpenClosed.Closed;

/**
 * FlatRateShipping
 */
public class FlatRateShipping implements ShippingStrategy {

    public double calculate(double weight){
      return 10;
    }

    
}