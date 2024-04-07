// Director
class ConstructionEngineer {
    private HouseBuilder builder;

    public ConstructionEngineer(HouseBuilder builder) {
        this.builder = builder;
    }

    public House constructHouse() {
        builder.buildFoundation();
        builder.buildStructure();
        builder.buildRoof();
        return builder.getResult();
    }
}