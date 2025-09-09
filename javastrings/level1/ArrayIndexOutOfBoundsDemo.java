import java.util.Scanner;

public class ArrayIndexOutOfBoundsDemo {

    // Method to generate the exception (without handling)
    public static void generateException(String[] names) {
        // Trying to access index beyond array length
        System.out.println("Accessing index 10: " + names[10]);
    }

    // Method to handle the exception with try-catch
    public static void handleException(String[] names) {
        try {
            System.out.println("Accessing index 10: " + names[10]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Caught ArrayIndexOutOfBoundsException: " + e.getMessage());
        } catch (RuntimeException e) {
            System.out.println("Caught RuntimeException: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take array input from user
        System.out.print("Enter the size of the array: ");
        int size = sc.nextInt();
        sc.nextLine(); // consume newline

        String[] names = new String[size];
        for (int i = 0; i < size; i++) {
            System.out.print("Enter name " + (i + 1) + ": ");
            names[i] = sc.nextLine();
        }

        System.out.println("\n=== Generating ArrayIndexOutOfBoundsException ===");
        try {
            generateException(names);
        } catch (Exception e) {
            System.out.println("Exception occurred: " + e);
        }

        System.out.println("\n=== Handling ArrayIndexOutOfBoundsException ===");
        handleException(names);

        sc.close();
}
}