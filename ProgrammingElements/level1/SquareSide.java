package ProgrammingElements.level1;
import java.util.Scanner;

public class SquareSide {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Take user input for perimeter
        System.out.print("Enter the perimeter of the square: ");
        double perimeter = input.nextDouble();

        // Calculate side (Perimeter = 4 × side)
        double side = perimeter / 4.0;

        // Print output
        System.out.println("The length of the side is " + side + " whose perimeter is " + perimeter);

        input.close();
    }
}
