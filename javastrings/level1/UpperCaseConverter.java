import java.util.Scanner;

public class UpperCaseConverter {

    // Method to convert lowercase letters to uppercase using ASCII
    public static String convertToUpper(String text) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            if (ch >= 'a' && ch <= 'z') {
                result.append((char) (ch - 32)); // convert to uppercase
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

        // User-defined uppercase conversion
        String manualUpper = convertToUpper(text);

        // Built-in uppercase conversion
        String builtinUpper = text.toUpperCase();

        // Compare both results
        boolean isSame = compareStrings(manualUpper, builtinUpper);

        System.out.println("\nManual UpperCase: " + manualUpper);
        System.out.println("Built-in UpperCase: " + builtinUpper);
        System.out.println("Are both equal? " + isSame);

        sc.close();
}
}