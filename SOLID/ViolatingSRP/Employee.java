package SOLID.ViolatingSRP;

import java.util.ArrayList;
import java.util.List;

//Here the class is Violating SRP
public class Employee {
    private String name;
    private String id;
    private List<Double> hoursWorked;
    
    public Employee(String name, String id){
        this.name = name;
        this.id = id;
        this.hoursWorked = new ArrayList<>();

    }
    
    public void addHoursWorked(double hours){
        hoursWorked.add(hours);
    }

    public String generateTimesheetReport(){
        StringBuilder report = new StringBuilder();

        report.append("Timesheet Report for ").append(name).append("(").append(id).append(")\n);
    }
    
}
