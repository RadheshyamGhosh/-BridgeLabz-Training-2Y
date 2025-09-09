import java.util.Scanner;

public class SplitWordsComparison {

    // Method to find length without using length()
    public static int findLength(String text) {
        int count = 0;
        try {
            while (true) {
                text.charAt(count); // will throw exception when index is out of bounds
                count++;
            }
        } catch (StringIndexOutOfBoundsException e) {
            // Stop when out of bounds
        }
        return count;
    }

    // Method to split words without using split()
    public static String[] splitWords(String text) {
        int length = findLength(text);

        // Count words
        int wordCount = 1; // at least 1 word
        for (int i = 0; i < length; i++) {
            if (text.charAt(i) == ' ') {
                wordCount++;
            }
        }

        // Store word boundaries
        int[] spaces = new int[wordCount + 1]; 
        int index = 0;
        for (int i = 0; i < length; i++) {
            if (text.charAt(i) == ' ') {
                spaces[++index] = i;
            }
        }
        spaces[wordCount] = length; // last boundary is end of string

        // Extract words
        String[] words = new String[wordCount];
        int start = 0;
        for (int i = 0; i < wordCount; i++) {
            int end = spaces[i + 1];
            StringBuilder sb = new StringBuilder();
            for (int j = start; j < end; j++) {
                if (text.charAt(j) != ' ') {
                    sb.append(text.charAt(j));
                }
            }
            words[i] = sb.toString();
            start = end;
        }

        return words;
    }

    // Method to compare two string arrays
    public static boolean compareArrays(String[] arr1, String[] arr2) {
        if (arr1.length != arr2.length) return false;
        for (int i = 0; i < arr1.length; i++) {
            if (!arr1[i].equals(arr2[i])) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take input
        System.out.print("Enter a sentence: ");
        String text = sc.nextLine();

        // Split using user-defined method
        String[] manualSplit = splitWords(text);

        // Split using built-in split()
        String[] builtinSplit = text.split(" ");

        // Compare results
        boolean same = compareArrays(manualSplit, builtinSplit);

        // Display results
        System.out.println("\nManual Split:");
        for (String w : manualSplit) {
            System.out.println(w);
        }

        System.out.println("\nBuilt-in Split:");
        for (String w : builtinSplit) {
            System.out.println(w);
        }

        System.out.println("\nComparison Result: " + (same ? "Both are same ✅" : "Different ❌"));

        sc.close();
    }
}