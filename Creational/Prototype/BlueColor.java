class BlueColor  implements ColorPrototype{

    private final String colorName;

    //Constructor
    private BlueColor(){
        this.colorName = "Blue";
    }

    @Override
    public ColorPrototype clone(){
        return new BlueColor();
    }
    
}
