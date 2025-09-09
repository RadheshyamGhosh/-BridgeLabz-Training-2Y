import java.util.Arrays;

public class FootballTeamHeights {

    // Method to calculate sum of array elements
    public static int findSum(int[] arr) {
        int sum = 0;
        for (int num : arr) sum += num;
        return sum;
    }

    // Method to calculate mean
    public static double findMean(int[] arr) {
        return (double) findSum(arr) / arr.length;
    }

    // Method to find shortest height
    public static int findShortest(int[] arr) {
        int min = arr[0];
        for (int num : arr) {
            if (num < min) min = num;
        }
        return min;
    }

    // Method to find tallest height
    public static int findTallest(int[] arr) {
        int max = arr[0];
        for (int num : arr) {
            if (num > max) max = num;
        }
        return max;
    }

    public static void main(String[] args) {
        int[] heights = new int[11];

        // Generate random heights between 150 and 250
        for (int i = 0; i < heights.length; i++) {
            heights[i] = (int)(Math.random() * 101) + 150; 
        }

        System.out.println("Player Heights: " + Arrays.toString(heights));

        int shortest = findShortest(heights);
        int tallest = findTallest(heights);
        double mean = findMean(heights);

        System.out.println("Shortest Height: " + shortest + " cm");
        System.out.println("Tallest Height: " + tallest + " cm");
        System.out.println("Mean Height: " + mean + " cm");
    }
}
