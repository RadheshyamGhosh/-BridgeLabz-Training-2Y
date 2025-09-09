import java.util.Scanner;

public class WordsWithLength {

    // Method to find length without using length()
    public static int findLength(String text) {
        int count = 0;
        try {
            while (true) {
                text.charAt(count); // throws exception when out of bounds
                count++;
            }
        } catch (StringIndexOutOfBoundsException e) {
            // stop loop
        }
        return count;
    }

    // Method to split text into words without using split()
    public static String[] splitWords(String text) {
        int length = findLength(text);

        // Count words
        int wordCount = 1; 
        for (int i = 0; i < length; i++) {
            if (text.charAt(i) == ' ') {
                wordCount++;
            }
        }

        String[] words = new String[wordCount];
        StringBuilder sb = new StringBuilder();
        int index = 0;

        for (int i = 0; i < length; i++) {
            char ch = text.charAt(i);
            if (ch == ' ') {
                words[index++] = sb.toString();
                sb.setLength(0); // reset for next word
            } else {
                sb.append(ch);
            }
        }
        words[index] = sb.toString(); // last word

        return words;
    }

    // Method to create 2D array [word, length]
    public static String[][] getWordsWithLength(String[] words) {
        String[][] result = new String[words.length][2];

        for (int i = 0; i < words.length; i++) {
            int len = findLength(words[i]); // custom length method
            result[i][0] = words[i];
            result[i][1] = String.valueOf(len); // convert number to string
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input text
        System.out.print("Enter a sentence: ");
        String text = sc.nextLine();

        // Get words
        String[] words = splitWords(text);

        // Get 2D array with lengths
        String[][] wordsWithLength = getWordsWithLength(words);

        // Display in tabular format
        System.out.println("\nWord\tLength");
        System.out.println("-----------------");
        for (String[] row : wordsWithLength) {
            System.out.println(row[0] + "\t" + Integer.parseInt(row[1]));
        }

        sc.close();
}
}