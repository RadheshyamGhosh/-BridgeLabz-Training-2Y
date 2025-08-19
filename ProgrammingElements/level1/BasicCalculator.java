package ProgrammingElements.level1;
import java.util.Scanner;

public class BasicCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Take user input
        System.out.print("Enter first number: ");
        double number1 = input.nextDouble();

        System.out.print("Enter second number: ");
        double number2 = input.nextDouble();

        // Perform operations
        double addition = number1 + number2;
        double subtraction = number1 - number2;
        double multiplication = number1 * number2;
        double division = 0;

        if (number2 != 0) {
            division = number1 / number2;
        } else {
            System.out.println("Division by zero is not allowed.");
        }

        // Print results in one line
        System.out.println("The addition, subtraction, multiplication and division value of 2 numbers " 
                           + number1 + " and " + number2 + " is " 
                           + addition + ", " + subtraction + ", " 
                           + multiplication + ", and " + division);

        input.close();
    }
}
