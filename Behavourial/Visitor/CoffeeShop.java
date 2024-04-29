package Behavourial.Visitor;

public class CoffeeShop  implements Building{
    public void accept(InsuranceAgent agent){
        agent.visit(this);
    }
    
}
