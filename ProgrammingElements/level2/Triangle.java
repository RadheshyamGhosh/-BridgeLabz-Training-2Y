package ProgrammingElements.level2;
import java.util.Scanner;
public class Triangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Take base and height input in centimeters
        System.out.print("Enter base in cm: ");
        double base = input.nextDouble();

        System.out.print("Enter height in cm: ");
        double height = input.nextDouble();

        // Calculate area in square cm
        double areaCm = 0.5 * base * height;

        // Convert square cm to square inches
        // 1 inch = 2.54 cm → 1 sq inch = (2.54 * 2.54) = 6.4516 sq cm
        double areaInch = areaCm / (2.54 * 2.54);

        // Output
        System.out.println("The Area of the triangle in sq in is " + areaInch + " and sq cm is " + areaCm);

        input.close();
    }
}
