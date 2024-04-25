//This defines how to handle the notifications
public class Reader implements SUbscriber{

    private String name;

    private Reader(String name){
        this.name = name;
    }
    
    @Override
    public void update(String issue){
        System.out.println(name + " received the ");
    }
    
}