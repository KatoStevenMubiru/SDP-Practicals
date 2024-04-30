package SOLID.ApplyingSRP;


public class TimesheetReport {
    public String generate(Employee employee) {
        StringBuilder report = new StringBuilder();
        report.append("Timesheet Report for ").append(employee.getName()).append(" (").append(employee.getId()).append(")\n");
        for (Double hours : employee.getHoursWorked()) {
            report.append(" - ").append(hours).append(" hours\n");
        }
        return report.toString();
    }
}
