import java.util.Scanner;

public class RocketLaunchCountdownFor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take input from user
        System.out.print("Enter the starting countdown number: ");
        int counter = sc.nextInt();

        // For loop for countdown
        for (int i = counter; i >= 1; i--) {
            System.out.println(i);
        }

        // After countdown ends
        System.out.println("🚀 Rocket Launched!");

        sc.close();
    }
}
