package Structural.Composite;

public class Client {
    public static void main(String[] args) {
        // Create individual products
        Product product1 = new Product(20.0);
        Product product2 = new Product(30.0);

        // Create a small box and add products to it
        Box smallBox = new Box(5.0);
        smallBox.addComponent(product1);
        smallBox.addComponent(product2);

        // Create a bigger box and add the small box to it
        Box bigBox = new Box(10.0);
        bigBox.addComponent(smallBox);

        // Add more products to the big box
        bigBox.addComponent(new Product(50.0));

        // Calculate the total price of the big box
        System.out.println("Total Price of Big Box: " + bigBox.getPrice());
    }
}