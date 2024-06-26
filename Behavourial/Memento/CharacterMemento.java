package Behavourial.Memento;
// This class holds the state of the 'GameCharacter'
public class CharacterMemento {
    private int health;
    private int level;
    private String location ;

    public CharacterMemento(int health, int level, String location){
        this.health = health;
        this.level  = level;
        this.location = location;
    }

    //These getters access the state 
    public int getHealth(){
        return health;
    }
    public int getLevel(){
        return level;
    }
    public String getLocation(){
        return location;
    }

    
}
