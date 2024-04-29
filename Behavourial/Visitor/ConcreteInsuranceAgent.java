package Behavourial.Visitor;

import Behavourial.Template.CoffeeShop;

public class ConcreteInsuranceAgent {
    public void visit(ResidentialBuilding residential){

        System.out.println("Offering medical insurance to residential building.");

    }

    public void visit(Bank bank){
        System.out.println("Offering theft insurance to the bank");
    }

    public void visit(CoffeeShop coffeeShop){
        System.out.println();
    }
}
