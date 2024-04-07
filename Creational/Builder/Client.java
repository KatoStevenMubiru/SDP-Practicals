//Client

public class Client{
    public static void main(String[] args) {
        HouseBuilder builder = new ConcreteHouseBuilder();
        ConstructionEngineer engineer = new ConstructionEngineer(builder);

        House house = engineer.constructHouse();
        house.displayHouseDetails();
    }
}