package Structural.Decorator;

public abstract class CoffeeDecorator implements Coffee {
    // initialize coffee object
    protected Coffee deocoratedCoffee;

    public CoffeeDecorator(Coffee coffee){
        this.deocoratedCoffee = coffee;
    }
    
}
