//Client code 

package Creational.AbstractFactory;

public class FurnitureShop {
        private Chair chair;
        private Sofa sofa;
        private CoffeeTable coffeeTable;

        public FurnitureShop(FurnitureFactory factory){
            chair = factory.createChair();
            sofa = factory.createSofa();
            coffeeTable = factory.createCoffeeTable();
        }
        public void showcaseFurniture(){
            chair.sitOn();
            sofa.relaxOn();
            coffeeTable.putOn();
        }
    
}