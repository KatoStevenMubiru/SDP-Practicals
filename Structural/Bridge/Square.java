package Structural.Bridge;

public class Square extends Shape {
    public Square(Color color){
        super(color);
    }
    public void draw(){
        System.out.println("Drawing Square");
        color.applyColor();
    }
}
