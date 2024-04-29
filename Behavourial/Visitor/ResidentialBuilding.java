package Behavourial.Visitor;

public class ResidentialBuilding implements Building {
    public void accept(InsuranceAgent agent){
        agent.visit(this);
    }
}
