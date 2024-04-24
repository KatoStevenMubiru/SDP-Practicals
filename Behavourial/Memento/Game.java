package Behavourial.Memento;

public class Game {
    public static void main(String[] args) {
        GameCharacter hero = new GameCharacter();
        Caretaker caretaker = new Caretaker();

        // Initial state
        hero.setHealth(100);
        hero.setLevel(1);
        hero.setLocation("Starting Point");
        caretaker.saveMemento(hero.save());

        // State change
        hero.setHealth(80);
        hero.setLevel(2);
        hero.setLocation("Forest");
        caretaker.saveMemento(hero.save());

        // Another state change
        hero.setHealth(50);
        hero.setLevel(3);
        hero.setLocation("Mountain");

        // Restore to previous state
        hero.restore(caretaker.getMemento());
        System.out.println("Restored to level " + hero.getLevel() + " at location " + hero.getLocation());

        // Restore to initial state
        hero.restore(caretaker.getMemento());
        System.out.println("Restored to level " + hero.getLevel() + " at location " + hero.getLocation());
    }
}