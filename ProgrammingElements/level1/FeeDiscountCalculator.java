package ProgrammingElements.level1;
import java.util.Scanner;

public class FeeDiscountCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Take user input
        System.out.print("Enter the course fee (INR): ");
        double fee = input.nextDouble();

        System.out.print("Enter the discount percent: ");
        double discountPercent = input.nextDouble();

        // Compute discount
        double discount = (fee * discountPercent) / 100.0;
        double finalFee = fee - discount;

        // Output result
        System.out.println("The discount amount is INR " + discount + 
                           " and final discounted fee is INR " + finalFee);

        input.close();
    }
}
