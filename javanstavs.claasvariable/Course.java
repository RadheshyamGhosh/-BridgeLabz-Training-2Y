public class Course {
    // Instance variables
    private String courseName;
    private final int duration; // in months
    private final double fee;

    // Class variable (shared among all Course instances)
    private static String instituteName = "Default Institute";

    // Constructor
    public Course(String courseName, int duration, double fee) {
        this.courseName = courseName;
        this.duration = duration;
        this.fee = fee;
    }

    public Course(int duration, double fee) {
        this.duration = duration;
        this.fee = fee;
    }

    // Instance method
    public void displayCourseDetails() {
        System.out.println("Course Name: " + courseName);
        System.out.println("Duration: " + duration + " months");
        System.out.println("Fee: $" + fee);
        System.out.println("Institute: " + instituteName);
        System.out.println();
    }

    // Class method to update institute name
    public static void updateInstituteName(String newName) {
        instituteName = newName;
    }

    // Main method to test
    public static void main(String[] args) {
        // Set a new institute name
        Course.updateInstituteName("Tech Academy");

        // Create courses
        Course c1 = new Course("Java Programming", 3, 500.0);
        Course c2 = new Course("Web Development", 4, 700.0);

        // Display course details
        c1.displayCourseDetails();
        c2.displayCourseDetails();

        // Update institute name again
        Course.updateInstituteName("CodeMasters Institute");

        // Display course details again to reflect updated institute
        c1.displayCourseDetails();
        c2.displayCourseDetails();
    }
}
