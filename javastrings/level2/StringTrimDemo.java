import java.util.Scanner;

public class StringTrimDemo {

    // Method to find start and end index after trimming spaces
    public static int[] findTrimIndexes(String text) {
        int start = 0;
        int end = text.length() - 1;

        // Trim leading spaces
        while (start <= end && text.charAt(start) == ' ') {
            start++;
        }

        // Trim trailing spaces
        while (end >= start && text.charAt(end) == ' ') {
            end--;
        }

        return new int[]{start, end};
    }

    // Method to create substring manually using charAt
    public static String createSubstring(String text, int start, int end) {
        String result = "";
        for (int i = start; i <= end; i++) {
            result += text.charAt(i);
        }
        return result;
    }

    // Method to compare two strings using charAt
    public static boolean compareStrings(String s1, String s2) {
        if (s1.length() != s2.length()) return false;

        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i)) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input
        System.out.print("Enter a string with leading and trailing spaces: ");
        String text = sc.nextLine();

        // User-defined trim
        int[] indexes = findTrimIndexes(text);
        String trimmedByUser = createSubstring(text, indexes[0], indexes[1]);

        // Built-in trim
        String trimmedBuiltIn = text.trim();

        // Compare
        boolean isEqual = compareStrings(trimmedByUser, trimmedBuiltIn);

        // Output
        System.out.println("\nOriginal String: [" + text + "]");
        System.out.println("User-defined Trim: [" + trimmedByUser + "]");
        System.out.println("Built-in Trim: [" + trimmedBuiltIn + "]");
        System.out.println("Are both equal? " + isEqual);

        sc.close();
}
}