import java.util.Scanner;

public class ShortestLongestWord {

    // Method to find string length without using length()
    public static int findLength(String text) {
        int count = 0;
        try {
            while (true) {
                text.charAt(count);
                count++;
            }
        } catch (StringIndexOutOfBoundsException e) {
            // stop counting
        }
        return count;
    }

    // Method to split text into words without using split()
    public static String[] splitWords(String text) {
        int length = findLength(text);

        // count words
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
                sb.setLength(0); // reset
            } else {
                sb.append(ch);
            }
        }
        words[index] = sb.toString(); // add last word

        return words;
    }

    // Method to create 2D array [word, length]
    public static String[][] getWordsWithLength(String[] words) {
        String[][] result = new String[words.length][2];
        for (int i = 0; i < words.length; i++) {
            int len = findLength(words[i]);
            result[i][0] = words[i];
            result[i][1] = String.valueOf(len);
        }
        return result;
    }

    // Method to find shortest and longest word
    public static String[] findShortestAndLongest(String[][] wordsWithLength) {
        String shortest = wordsWithLength[0][0];
        String longest = wordsWithLength[0][0];

        for (int i = 1; i < wordsWithLength.length; i++) {
            int len = Integer.parseInt(wordsWithLength[i][1]);
            if (len < findLength(shortest)) {
                shortest = wordsWithLength[i][0];
            }
            if (len > findLength(longest)) {
                longest = wordsWithLength[i][0];
            }
        }
        return new String[]{shortest, longest};
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input
        System.out.print("Enter a sentence: ");
        String text = sc.nextLine();

        // Process
        String[] words = splitWords(text);
        String[][] wordsWithLength = getWordsWithLength(words);
        String[] result = findShortestAndLongest(wordsWithLength);

        // Display
        System.out.println("\nWord\tLength");
        System.out.println("-----------------");
        for (String[] row : wordsWithLength) {
            System.out.println(row[0] + "\t" + row[1]);
        }

        System.out.println("\nShortest Word: " + result[0]);
        System.out.println("Longest Word: " + result[1]);

        sc.close();
    }
}