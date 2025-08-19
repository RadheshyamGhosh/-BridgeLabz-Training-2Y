import java.util.Scanner;

public class TriangleArea {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Take user input for base and height in inches
        System.out.print("Enter the base of the triangle (in inches): ");
        double base = input.nextDouble();

        System.out.print("Enter the height of the triangle (in inches): ");
        double height = input.nextDouble();

        // Calculate area in square inches
        double areaInInches = 0.5 * base * height;

        // Convert to square centimeters (1 inch = 2.54 cm, so 1 sq inch = 2.54^2 sq cm)
        double areaInCm = areaInInches * (2.54 * 2.54);

        // Print output
        System.out.println("The area of the triangle is " + areaInInches 
                           + " square inches and " + areaInCm + " square centimeters.");

        input.close();
    }
}
