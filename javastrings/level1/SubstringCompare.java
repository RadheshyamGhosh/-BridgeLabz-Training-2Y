import java.util.Scanner;

public class SubstringCompare {

    // Method to create substring using charAt()
    public static String createSubstring(String text, int start, int end) {
        String result = "";
        for (int i = start; i < end; i++) {
            result += text.charAt(i); // append each char
        }
        return result;
    }

    // Method to compare two strings using charAt()
    public static boolean compareUsingCharAt(String s1, String s2) {
        if (s1.length() != s2.length()) {
            return false;
        }
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input string
        System.out.print("Enter a string: ");
        String text = sc.next();

        // Input start and end index
        System.out.print("Enter start index: ");
        int start = sc.nextInt();

        System.out.print("Enter end index: ");
        int end = sc.nextInt();

        // Create substring manually
        String manualSubstring = createSubstring(text, start, end);

        // Create substring using built-in method
        String builtinSubstring = text.substring(start, end);

        // Compare the substrings
        boolean areEqual = compareUsingCharAt(manualSubstring, builtinSubstring);

        // Display results
        System.out.println("Manual Substring (charAt): " + manualSubstring);
        System.out.println("Built-in Substring: " + builtinSubstring);
        System.out.println("Are both substrings equal? " + areEqual);

        sc.close();
}
}