class Employee {
    String name;
    int id;
    double salary;

    void displayDetails() {
        System.out.println("Employee ID: " + id);
        System.out.println("Employee Name: " + name);
        System.out.println("Employee Salary: " + salary);
        System.out.println("-------------------------");
    }
}

public class EmployeeDetail {
    public static void main(String[] args) {
        // Creating objects
        Employee emp1 = new Employee();
        emp1.id = 101;
        emp1.name = "Radhey";
        emp1.salary = 50000;

        Employee emp2 = new Employee();
        emp2.id = 102;
        emp2.name = "Shyam";
        emp2.salary = 60000;

        // Display details
        emp1.displayDetails();
        emp2.displayDetails();
    }
}
