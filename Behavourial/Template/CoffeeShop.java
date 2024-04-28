package Behavourial.Template;

public class CoffeeShop {
    public static void main(String[] args) {
        
        CoffeeBrewer americano = new AmericanoCoffee();
        americano.prepareCoffee();

        System.out.println("-----------------------------");

        CoffeeBrewer espresso = new EspressoCoffee();
        espresso.prepareCoffee();
    }
    
}
