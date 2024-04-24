package Behavourial.Memento;

public class GameCharacter {
    private int health;
    private int level;
    private String location;

    //Setters
    public void setHealth(int health){
         this.health = health;
    }
    public void setLevel(int level){
        this.level = level;
    }
    public void setLocation(String location){
        this.location = location;
    }

    //Save
    public CharacterMemento save(){
        return new CharacterMemento(health, level, location);
    }

    //Restore 
    public void restore(CharacterMemento memento){
        this.health = memento.getHealth();
        this.level  = memento.getLevel();
        this.location = memento.getLocation();
    }

}
