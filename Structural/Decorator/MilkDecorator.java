package Structural.Decorator;

public class MilkDecorator extends CoffeeDecorator{
    private MilkDecorator deocoratedCoffee;
	public MilkDecorator(Coffee coffee){
        super(coffee);
    }

    @Override
    public String getDescription(){
        return deocoratedCoffee.getDescription() + ", Milk";
    }
    @Override
    public double getCost(){
        return decoratedCoffee.getCost() + 0.50;
    }
    
}
