package Behavourial.Template;

public class AmericanoCoffee extends CoffeeBrewer{

    @Override
    protected void brew(){
        System.out.println("Dripping Coffee through filter");
    }

    @Override
    protected void addCondiments(){
        System.out.println("Adding sugar and cream");
    }
    
}
