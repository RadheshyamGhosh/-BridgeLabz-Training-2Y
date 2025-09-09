import java.util.Scanner;

public class NumberFormatDemo {

    // Method to generate the exception (without handling)
    public static void generateException(String text) {
        // Trying to convert non-numeric string into integer
        int number = Integer.parseInt(text);
        System.out.println("Converted number: " + number);
    }

    // Method to handle the exception with try-catch
    public static void handleException(String text) {
        try {
            int number = Integer.parseInt(text);
            System.out.println("Converted number: " + number);
        } catch (NumberFormatException e) {
            System.out.println("Caught NumberFormatException: " + e.getMessage());
        } catch (RuntimeException e) {
            System.out.println("Caught RuntimeException: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String text = sc.nextLine();

        System.out.println("\n=== Generating NumberFormatException ===");
        try {
            generateException(text);
        } catch (Exception e) {
            System.out.println("Exception occurred: " + e);
        }

        System.out.println("\n=== Handling NumberFormatException ===");
        handleException(text);

        sc.close();
}
}