import java.util.Scanner;

public class NumberCheck {

    // Method to check positive or negative
    public static boolean isPositive(int num) {
        return num >= 0;
    }

    // Method to check even or odd
    public static boolean isEven(int num) {
        return num % 2 == 0;
    }

    // Method to compare two numbers
    public static int compare(int num1, int num2) {
        if (num1 > num2) return 1;
        else if (num1 == num2) return 0;
        else return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numbers = new int[5];

        // Input numbers
        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            numbers[i] = sc.nextInt();
        }

        // Check positive/negative and even/odd
        for (int i = 0; i < numbers.length; i++) {
            int num = numbers[i];
            if (isPositive(num)) {
                if (isEven(num))
                    System.out.println(num + " is Positive and Even");
                else
                    System.out.println(num + " is Positive and Odd");
            } else {
                System.out.println(num + " is Negative");
            }
        }

        // Compare first and last element
        int result = compare(numbers[0], numbers[numbers.length - 1]);
        System.out.print("Comparison of first and last element: ");
        if (result == 1) {
            System.out.println(numbers[0] + " is greater than " + numbers[numbers.length - 1]);
        } else if (result == 0) {
            System.out.println(numbers[0] + " is equal to " + numbers[numbers.length - 1]);
        } else {
            System.out.println(numbers[0] + " is less than " + numbers[numbers.length - 1]);
        }

        sc.close();
    }
}
