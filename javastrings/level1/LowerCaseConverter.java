import java.util.Scanner;

public class LowerCaseConverter {

    // Method to convert uppercase letters to lowercase using ASCII
    public static String convertToLower(String text) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            if (ch >= 'A' && ch <= 'Z') {
                result.append((char) (ch + 32)); // convert to lowercase
            } else {
                result.append(ch); // keep unchanged
            }
        }
        return result.toString();
    }

    // Method to compare two strings character by character
    public static boolean compareStrings(String s1, String s2) {
        if (s1.length() != s2.length()) return false;
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take full text input
        System.out.print("Enter a text: ");
        String text = sc.nextLine();

        // User-defined lowercase conversion
        String manualLower = convertToLower(text);

        // Built-in lowercase conversion
        String builtinLower = text.toLowerCase();

        // Compare both results
        boolean isSame = compareStrings(manualLower, builtinLower);

        System.out.println("\nManual LowerCase: " + manualLower);
        System.out.println("Built-in LowerCase: " + builtinLower);
        System.out.println("Are both equal? " + isSame);

        sc.close();
}
}