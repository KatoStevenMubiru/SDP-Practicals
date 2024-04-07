//Concrete Builder

class ConcreteHouseBuilder implements HouseBuilder {

    private House house = new House();

    public void buildFoundation(){
        house.setFoundation("Concrete Foundation");
    }
    public void buildStructure(){
        house.setStructure("Concrete Structure");
    }
    public void buildRoof(){
        house.setRoof("Concrete Roof");
    }
    public House getResult(){
        return house;
    }
    
}