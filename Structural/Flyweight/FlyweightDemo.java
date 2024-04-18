package Flyweight;

public class FlyweightDemo {
     private static final String[] colors = {"Red", "Green", "Blue", "White", "Black"};

     public static void main(String[] args) {
        for( int i = 0; i < 20; ++i){
            Circle circle = CircleFactory.getCircle(getRandomColor());
            int x = getRandomX();
            int y = getRandomY();
            circle.draw(x, y);
        }
     }

     private static String getRandomColor(){
        return colors[(int) (Math.random() * colors.length)];
     }
     private static int getRandomX(){
        return (int) (Math.random() * 100);
     }
     private static int getRandomY(){
        return (int) (Math.random() * 100);
     }
}