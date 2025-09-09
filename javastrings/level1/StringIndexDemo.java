import java.util.Scanner;

public class StringIndexDemo {

    // Method to generate the exception
    public static void generateException(String text) {
        // Accessing beyond string length
        System.out.println("Character at invalid index: " + text.charAt(text.length())); 
        // This will throw StringIndexOutOfBoundsException
    }

    // Method to handle the exception
    public static void handleException(String text) {
        try {
            System.out.println("Character at invalid index: " + text.charAt(text.length())); 
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Caught Exception: Tried to access index beyond string length!");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String text = sc.nextLine();

        System.out.println("\n=== Generating StringIndexOutOfBoundsException ===");
        try {
            generateException(text);
        } catch (Exception e) {
            System.out.println("Exception occurred: " + e);
        }

        System.out.println("\n=== Handling StringIndexOutOfBoundsException ===");
        handleException(text);

        sc.close();
}
}