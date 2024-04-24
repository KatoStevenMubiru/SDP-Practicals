package Behavourial.Memento;
//This class manages the mementos implicitly
public class Caretaker {
    private Stack<CharacterMemento> mementos = new Stack<>();

    public void saveMemento(CharacterMemento memento){
        mementos.push(memento);

    }
    public CharacterMemento getMemento(){
        
    }
}
