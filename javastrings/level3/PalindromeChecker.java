import java.util.Scanner;

public class PalindromeChecker {

    // Logic 1: Compare characters from start and end of the string
    public static boolean isPalindromeLogic1(String str) {
        int start = 0;
        int end = str.length() - 1;

        // Loop through the string and compare characters
        while (start < end) {
            if (str.charAt(start) != str.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }

    // Logic 2: Recursive method to compare characters from start and end
    public static boolean isPalindromeLogic2(String str, int start, int end) {
        if (start >= end) {
            return true;
        }
        if (str.charAt(start) != str.charAt(end)) {
            return false;
        }
        return isPalindromeLogic2(str, start + 1, end - 1);
    }

    // Logic 3: Compare the original and reversed string
    public static boolean isPalindromeLogic3(String str) {
        String reversedStr = new StringBuilder(str).reverse().toString();
        return str.equals(reversedStr);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get user input for the string
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        // Check using the three different logics
        boolean palindromeLogic1 = isPalindromeLogic1(input);
        boolean palindromeLogic2 = isPalindromeLogic2(input, 0, input.length() - 1);
        boolean palindromeLogic3 = isPalindromeLogic3(input);

        // Display results for each logic
        System.out.println("Palindrome Check using Logic 1: " + palindromeLogic1);
        System.out.println("Palindrome Check using Logic 2: " + palindromeLogic2);
        System.out.println("Palindrome Check using Logic 3: " + palindromeLogic3);
}
}