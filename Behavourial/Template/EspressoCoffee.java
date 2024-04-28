package Behavourial.Template;

public class EspressoCoffee extends CoffeeBrewer {

    @Override
    protected void brew(){
        System.out.println("Forcing water through ground coffee");
    }    

    @Override
    protected void addCondiments(){
        System.out.println("No condiments added");
    }
}
