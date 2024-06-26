import java.util.ArrayList;

class Employee{
    private String name;
    private String id;
    private List<Double> hoursWorked;

    public Employee(String name, String id){
        this.name = name;
        this.id = name;
        this.hoursWorked = new ArrayList<>();
    }

    public void addHoursWorked(double hours){
        hoursWorked.add(hours);
    }

    public List<Double> getHoursWorked(){
        return hoursWorked;
    }

    public String getName(){
        return name;
    }

    public String getId(){
        return id;
    }

}
