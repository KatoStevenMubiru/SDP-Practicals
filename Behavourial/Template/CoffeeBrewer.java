package Behavourial.Template;

public class CoffeeBrewer {
    public final void prepareCoffee(){
        boilWater();
        brew();
        pourInCup();
        addCondiments();
    }

    private void boilWater(){
        System.out.println("Boiling water");
    }
    protected abstract void brew();

    private void pourInCup(){
        
    }
}
