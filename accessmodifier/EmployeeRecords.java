package accessmodifier;

class Employee {
    public int employeeID;
    protected String department;
    private double salary;

    public Employee(int employeeID, String department, double salary) {
        this.employeeID = employeeID;
        this.department = department;
        this.salary = salary;
    }

    // Public method to modify salary
    public void setSalary(double salary) {
        this.salary = salary;
    }

    // Public method to get salary
    public double getSalary() {
        return salary;
    }
}

class Manager extends Employee {
    private String team;

    public Manager(int employeeID, String department, double salary, String team) {
        super(employeeID, department, salary);
        this.team = team;
    }

    public void displayManagerInfo() {
        System.out.println("Manager ID: " + employeeID);       // public access
        System.out.println("Department: " + department);       // protected access
        System.out.println("Salary: $" + getSalary());
        System.out.println("Team: " + team);
    }
}

public class EmployeeRecords {
    public static void main(String[] args) {
        Manager mgr = new Manager(101, "Sales", 75000, "Team A");
        mgr.displayManagerInfo();

        // Modify salary
        mgr.setSalary(80000);
        System.out.println("Updated Salary: $" + mgr.getSalary());
    }
}
