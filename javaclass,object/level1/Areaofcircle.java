import java.util.Random;

class Circle {
    double radius;

    // Constructor with random radius
    Circle() {
        Random rand = new Random();
        // Generate random radius between 1 and 100
        this.radius = 1 + rand.nextInt(100);
    }

    // Method to calculate area
    double calculateArea() {
        return Math.PI * radius * radius;
    }

    // Method to calculate circumference
    double calculateCircumference() {
        return 2 * Math.PI * radius;
    }

    // Method to display details
    void displayDetails() {
        System.out.println("Radius: " + radius);
        System.out.println("Area: " + calculateArea());
        System.out.println("Circumference: " + calculateCircumference());
    }
}

public class Areaofcircle {
    public static void main(String[] args) {
        Circle c1 = new Circle();  // random radius
        c1.displayDetails();
    }
}
