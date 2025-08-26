import java.util.Scanner;

public class SpringSeason {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking input
        System.out.print("Enter month (1-12): ");
        int month = sc.nextInt();
        System.out.print("Enter day (1-31): ");
        int day = sc.nextInt();

        boolean isSpring = false;

        // Check for Spring Season: March 20 – June 20
        if ((month == 3 && day >= 20 && day <= 31) ||   // March 20-31
            (month == 4 && day >= 1 && day <= 30) ||    // April full
            (month == 5 && day >= 1 && day <= 31) ||    // May full
            (month == 6 && day >= 1 && day <= 20)) {    // June 1-20
            isSpring = true;
        }

        // Print result
        if (isSpring) {
            System.out.println("It's a Spring Season");
        } else {
            System.out.println("Not a Spring Season");
        }

        sc.close();
    }
}
