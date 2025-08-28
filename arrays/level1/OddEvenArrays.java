import java.util.Scanner;

public class OddEvenArrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Step 1: Take user input
        System.out.print("Enter a natural number: ");
        int number = sc.nextInt();

        // Step 2: Check if input is a natural number
        if (number <= 0) {
            System.out.println("Error: Please enter a natural number greater than 0.");
            sc.close();
            return;
        }

        // Step 3: Create arrays for odd and even numbers
        int[] oddNumbers = new int[number / 2 + 1];
        int[] evenNumbers = new int[number / 2 + 1];

        int oddIndex = 0, evenIndex = 0;

        // Step 4: Iterate from 1 to number
        for (int i = 1; i <= number; i++) {
            if (i % 2 == 0) {
                evenNumbers[evenIndex] = i;
                evenIndex++;
            } else {
                oddNumbers[oddIndex] = i;
                oddIndex++;
            }
        }

        // Step 5: Print odd numbers array
        System.out.print("Odd Numbers: ");
        for (int i = 0; i < oddIndex; i++) {
            System.out.print(oddNumbers[i] + " ");
        }

        // Step 6: Print even numbers array
        System.out.print("\nEven Numbers: ");
        for (int i = 0; i < evenIndex; i++) {
            System.out.print(evenNumbers[i] + " ");
        }

        sc.close();
    }
}
