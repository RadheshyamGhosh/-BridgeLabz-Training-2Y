import java.util.Scanner;

public class UniqueCharacterFinder {

    // Method to find the length of the string without using the length() method
    public static int getStringLength(String str) {
        int length = 0;
        try {
            while (true) {
                str.charAt(length);
                length++;
            }
        } catch (StringIndexOutOfBoundsException e) {
            // This exception is thrown when the index is out of bounds, which indicates the end of the string
        }
        return length;
    }

    // Method to find unique characters in a string
    public static char[] findUniqueCharacters(String str) {
        int length = getStringLength(str);
        char[] uniqueChars = new char[length];
        int uniqueCount = 0;

        for (int i = 0; i < length; i++) {
            char currentChar = str.charAt(i);
            boolean isUnique = true;

            // Check if the character has already appeared
            for (int j = 0; j < i; j++) {
                if (str.charAt(j) == currentChar) {
                    isUnique = false;
                    break;
                }
            }

            // If unique, add to the result array
            if (isUnique) {
                uniqueChars[uniqueCount++] = currentChar;
            }
        }

        // Create a new array with only the unique characters
        char[] result = new char[uniqueCount];
        System.arraycopy(uniqueChars, 0, result, 0, uniqueCount);
        return result;
    }

    // Method to display the unique characters
    public static void displayUniqueCharacters(char[] uniqueChars) {
        System.out.print("Unique characters: ");
        for (char c : uniqueChars) {
            System.out.print(c + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get user input for the string
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        // Step 1: Find unique characters in the string
        char[] uniqueChars = findUniqueCharacters(input);

        // Step 2: Display the unique characters
        displayUniqueCharacters(uniqueChars);
}
}