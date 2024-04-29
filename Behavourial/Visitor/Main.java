package Behavourial.Visitor;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        List<Building> buildings = Arrays.asList(new ResidentialBuilding(), new Bank(), new CoffeeShop());
        InsuranceAgent agent = new ConcreteInsuranceAgent();
        for(Building building: buildings){
            building.accept(agent);
        }
    }
    
}
