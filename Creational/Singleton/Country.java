package Creational.Singleton;

public class Country {
    public static void main(String[] args){

        Government govt = Government.getInstance("Museveni", "Uganda");

        govt.displayGovernementDetails();

        Government anothGovernment = Government.getInstance("Kagame", "Rwanda");

        anothGovernment.displayGovernementDetails();
    }
    
}
