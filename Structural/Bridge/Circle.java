//Refined Abstraction
package Structural.Bridge;

public class Circle  extends Shape{
    public Circle(Color color){
        super(color);
    }
    public void draw(){
        System.out.println("Drawing Circle");
        color.applyColor();
    }
}
