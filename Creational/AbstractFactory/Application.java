// Application Configuration code

public class Application{
    public static void main(String[] args) {
        FurnitureFactory factory;
        //Factory type
        factory = new ModernFurnitureFactory();

        //we shop what we want below
        FurnitureShop shop = new FurnitureShop(factory);
        shop.showcaseFurniture();
    }
}