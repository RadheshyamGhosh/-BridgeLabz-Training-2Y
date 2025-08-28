import java.util.Scanner;

public class PowerWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take user input
        System.out.print("Enter the number: ");
        int number = sc.nextInt();

        System.out.print("Enter the power: ");
        int power = sc.nextInt();

        int result = 1;    // initial value
        int counter = 0;   // temp counter

        while (counter < power) {   // run until counter == power
            result = result * number;
            counter++;
        }

        System.out.println(number + " ^ " + power + " = " + result);

        sc.close();
    }
}
