import java.util.Scanner;

public class StringLengthFinder {

    // Method to calculate length of string without using length()
    public static int findLength(String text) {
        int count = 0;
        try {
            while (true) {  // infinite loop
                text.charAt(count); // will throw exception when out of range
                count++;
            }
        } catch (StringIndexOutOfBoundsException e) {
            // Exception means we've reached the end of the string
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take input
        System.out.print("Enter a string: ");
        String text = sc.next();

        // Find length using custom method
        int manualLength = findLength(text);

        // Find length using built-in method
        int builtinLength = text.length();

        // Display results
        System.out.println("\nManual Length: " + manualLength);
        System.out.println("Built-in Length: " + builtinLength);

        sc.close();
}
}