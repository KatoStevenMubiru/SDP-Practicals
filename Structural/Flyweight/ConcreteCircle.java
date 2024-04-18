package Flyweight;

public class ConcreteCircle  implements Circle{
     private final String color; // Intrinsic state
     
     public ConcreteCircle(String color){
        this.color = color;
        System.out.print("Creating a circle of color: " + color);
     }

     @Override
     public void draw(int x, int y){
        System.out.println("Drawing " + color + " circle at (" + x + ", " + y + ")");
     }

    
}