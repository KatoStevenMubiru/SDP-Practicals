package Structural.Bridge;

public class Main {
    public static void main(String[] args) {
        Color red = new Red();
        Color blue = new Blue();

        Shape redCircle = new Circle(red);
        redCircle.draw();

        Shape blueSquare = new Square(blue);
        blueSquare.draw();
    }
    
}
