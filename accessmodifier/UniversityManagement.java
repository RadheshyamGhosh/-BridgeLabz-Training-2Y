package accessmodifier;
class Student {
    public int rollNumber;
    protected String name;
    private double cgpa;

    public Student(int roll, String name, double cgpa) {
        this.rollNumber = roll;
        this.name = name;
        this.cgpa = cgpa;
    }

    public double getCgpa() {
        return cgpa;
    }

    public void setCgpa(double cgpa) {
        this.cgpa = cgpa;
    }

    public void display() {
        System.out.println(rollNumber + " | " + name + " | CGPA: " + cgpa);
    }
}

class PostgraduateStudent extends Student {
    private String specialization;

    public PostgraduateStudent(int roll, String name, double cgpa, String spec) {
        super(roll, name, cgpa);
        this.specialization = spec;
    }

    public void displayPG() {
        System.out.println(name + " (PG - " + specialization + ") | CGPA: " + getCgpa());
    }
}

public class UniversityManagement {
    public static void main(String[] args) {
        Student s = new Student(101, "Alice", 8.5);
        s.setCgpa(9.0);
        s.display();

        PostgraduateStudent pg = new PostgraduateStudent(202, "Bob", 9.2, "AI");
        pg.displayPG();
    }
}
