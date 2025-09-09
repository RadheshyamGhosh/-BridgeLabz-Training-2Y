import java.util.Scanner;

public class IllegalArgumentDemo {

    // Method to generate the exception
    public static void generateException(String text) {
        // Start index > end index → IllegalArgumentException
        System.out.println("Substring: " + text.substring(5, 2)); 
    }

    // Method to handle the exception
    public static void handleException(String text) {
        try {
            System.out.println("Substring: " + text.substring(5, 2)); 
        } catch (IllegalArgumentException e) {
            System.out.println("Caught IllegalArgumentException: " + e.getMessage());
        } catch (RuntimeException e) {
            System.out.println("Caught RuntimeException: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String text = sc.nextLine();

        System.out.println("\n=== Generating IllegalArgumentException ===");
        try {
            generateException(text);
        } catch (Exception e) {
            System.out.println("Exception occurred: " + e);
        }

        System.out.println("\n=== Handling IllegalArgumentException ===");
        handleException(text);

        sc.close();
}
}