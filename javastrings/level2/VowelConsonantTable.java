import java.util.Scanner;

public class VowelConsonantTable {

    // Method to check if the character is a vowel, consonant, or not a letter
    public static String checkCharType(char ch) {
        // Convert uppercase to lowercase manually using ASCII
        if (ch >= 'A' && ch <= 'Z') {
            ch = (char) (ch + 32); // 'A'(65) -> 'a'(97)
        }

        // Check vowels
        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
            return "Vowel";
        }
        // Check consonants
        else if (ch >= 'a' && ch <= 'z') {
            return "Consonant";
        }
        // Not a letter
        else {
            return "Not a Letter";
        }
    }

    // Method to return 2D array of characters and their type
    public static String[][] findCharTypes(String text) {
        String[][] result = new String[text.length()][2];

        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            result[i][0] = String.valueOf(ch);         // character
            result[i][1] = checkCharType(ch);          // type
        }

        return result;
    }

    // Method to display 2D array in tabular format
    public static void displayTable(String[][] table) {
        System.out.println("\nCharacter\tType");
        System.out.println("----------------------------");
        for (int i = 0; i < table.length; i++) {
            System.out.println("   " + table[i][0] + "\t\t" + table[i][1]);
        }
    }

    // Main method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input
        System.out.print("Enter a string: ");
        String text = sc.nextLine();

        // Process
        String[][] charTypes = findCharTypes(text);

        // Output
        displayTable(charTypes);

        sc.close();
}
}