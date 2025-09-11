class Student {
    String name;
    int rollNumber;
    int marks;

    // Constructor
    Student(String name, int rollNumber, int marks) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.marks = marks;
    }

    // Method to calculate grade
    String calculateGrade() {
        if (marks >= 90) {
            return "A";
        } else if (marks >= 75) {
            return "B";
        } else if (marks >= 50) {
            return "C";
        } else if (marks >= 35) {
            return "D";
        } else {
            return "F (Fail)";
        }
    }

    // Method to display student details and grade
    void displayDetails() {
        System.out.println("Name       : " + name);
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Marks      : " + marks);
        System.out.println("Grade      : " + calculateGrade());
        System.out.println("-----------------------------");
    }
}

public class StudentReportDemo {
    public static void main(String[] args) {
        // Create Student objects
        Student s1 = new Student("Amar", 101, 92);
        Student s2 = new Student("Akbar", 102, 76);
        Student s3 = new Student("Anthony", 103, 48);

        // Display Reports
        s1.displayDetails();
        s2.displayDetails();
        s3.displayDetails();
    }
}
