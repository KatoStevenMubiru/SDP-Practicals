package Structural.Decorator;

public class BasisCoffee implements Coffee{
    @Override
    public String getDescription(){
        return "Basic Coffee";
    }

    @Override
    public double getCost(){
        return 2.00;
    }
    
}
