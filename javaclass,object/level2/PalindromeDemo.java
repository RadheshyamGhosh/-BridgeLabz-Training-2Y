class PalindromeChecker {
    String text;

    // Constructor
    PalindromeChecker(String text) {
        this.text = text;
    }

    // Method to check palindrome
    boolean isPalindrome() {
        int left = 0;
        int right = text.length() - 1;

        while (left < right) {
            if (text.charAt(left) != text.charAt(right)) {
                return false; // not a palindrome
            }
            left++;
            right--;
        }
        return true; // is a palindrome
    }

    // Display Result
    void displayResult() {
        if (isPalindrome()) {
            System.out.println("The text \"" + text + "\" is a Palindrome.");
        } else {
            System.out.println("The text \"" + text + "\" is NOT a Palindrome.");
        }
    }
}

public class PalindromeDemo {
    public static void main(String[] args) {
        // Example 1
        PalindromeChecker p1 = new PalindromeChecker("madam");
        p1.displayResult();

        // Example 2
        PalindromeChecker p2 = new PalindromeChecker("hello");
        p2.displayResult();

        // Example 3
        PalindromeChecker p3 = new PalindromeChecker("racecar");
        p3.displayResult();
    }
}
