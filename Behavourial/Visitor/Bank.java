package Behavourial.Visitor;

public class Bank implements Building {
    public void accept(InsuranceAgent agent){
        agent.visit(this);
    }
}
