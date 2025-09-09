import java.util.Scanner;

public class StringToCharArray {

    // Method to return characters of a string without using toCharArray()
    public static char[] getChars(String text) {
        char[] result = new char[text.length()];
        for (int i = 0; i < text.length(); i++) {
            result[i] = text.charAt(i);
        }
        return result;
    }

    // Method to compare two char arrays
    public static boolean compareArrays(char[] arr1, char[] arr2) {
        if (arr1.length != arr2.length) {
            return false;
        }
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] != arr2[i]) {
                return false;
            }
        }
        return true;
    }

    // Method to print a char array
    public static void printCharArray(char[] arr) {
        for (char c : arr) {
            System.out.print(c + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take user input
        System.out.print("Enter a string: ");
        String text = sc.next();

        // Convert using user-defined method
        char[] manualArray = getChars(text);

        // Convert using built-in method
        char[] builtinArray = text.toCharArray();

        // Compare both arrays
        boolean areEqual = compareArrays(manualArray, builtinArray);

        // Display results
        System.out.print("Manual char array: ");
        printCharArray(manualArray);

        System.out.print("Built-in char array: ");
        printCharArray(builtinArray);

        System.out.println("Are both arrays equal? " + areEqual);

        sc.close();
}
}