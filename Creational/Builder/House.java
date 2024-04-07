//The Product
//This is the complex product we are making

 class House {

    //parts of the house
    private String foundation;
    private String structure;
    private String roof;

    public void setFoundation(String foundation){
        this.foundation = foundation;
    }
    public void setStructure(String structure){
        this.structure = structure;
    }
    public void setRoof(String roof){
        this.roof = roof;
    }
    public void displayHouseDetails(){
        System.out.println("House with" + foundation + ", " + structure + ", and " + roof );
    }
}