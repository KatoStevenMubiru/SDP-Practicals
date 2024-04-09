package Creational.Singleton;

public class Government {
    private static Government instance;
    private String leader;
    private String countryName;

    //Private constructor
    private Government(String leader, String countryName){
        this.leader = leader;
        this.countryName = countryName;
    }
    
    //Private method to get the instance of Government 
    public static Government getInstance(String leader, String countryName){
        if(instance == null){
            instance = new Government(leader, countryName);

        }
        return instance;
    }

    //Display Government details, keep private
    public void displayGovernementDetails(){
        System.out.println("Government of " + countryName + " led by " + leader);
    }
}
