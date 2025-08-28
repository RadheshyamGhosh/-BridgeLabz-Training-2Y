import java.util.Scanner;

public class FactorsArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Step 1: Take user input
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        // Step 2: Initialize factor storage
        int maxFactor = 10;                     // initial size
        int[] factors = new int[maxFactor];     // array for factors
        int index = 0;                          // track position

        // Step 3: Loop to find factors
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                // Check if array is full
                if (index == maxFactor) {
                    // Double the size
                    maxFactor *= 2;
                    int[] temp = new int[maxFactor];
                    // Copy old values
                    for (int j = 0; j < index; j++) {
                        temp[j] = factors[j];
                    }
                    factors = temp; // point to new array
                }

                // Store factor
                factors[index] = i;
                index++;
            }
        }

        // Step 4: Display factors
        System.out.print("Factors of " + number + ": ");
        for (int i = 0; i < index; i++) {
            System.out.print(factors[i] + " ");
        }

        sc.close();
    }
}
