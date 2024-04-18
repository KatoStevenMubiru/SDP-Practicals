package Flyweight;

public class FlyweightDemo {
     private static final string[] colors = {"Red", "Green", "Blue", "White", "Black"};

     public static void main(String[] args) {
        for( int i = 0; i < 20; ++i){
            Circle circle = CircleFactory.getCircle(getRandomColor());
            int x = getRandomX();
            int y = getRandomY();
            circle.draw(x, y);
        }
     }
    
}