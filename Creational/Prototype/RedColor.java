
class RedColor  implements ColorPrototype{
    private final String colorName;

    //Constructor
    public RedColor(){
        this.colorName = "Red";
    }
    @Override
    public ColorPrototype clone(){
        return new RedColor();
    }

    public String getColorName(){
        return colorName;
    }
}
