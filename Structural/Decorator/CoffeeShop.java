package Structural.Decorator;

public class CoffeeShop {
    public static void main(String[] args) {
        Coffee myCoffee = new BasicCoffee();
        System.out.println(myCoffee.getDescription() + " Cost: $" + myCoffee.getCost());

        myCoffee = new MilkDecorator(myCoffee);
        System.out.println(myCoffee.getDescription() + " Cost: $" + myCoffee.getCost());

        myCoffee = new SugarDecorator(myCoffee);
        System.out.println(myCoffee.getDescription() + " Cost: $" + myCoffee.getCost());
    }
}