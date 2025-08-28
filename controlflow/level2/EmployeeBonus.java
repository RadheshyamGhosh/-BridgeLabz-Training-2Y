import java.util.Scanner;

public class EmployeeBonus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input salary and years of service
        System.out.print("Enter employee salary: ");
        double salary = sc.nextDouble();

        System.out.print("Enter years of service: ");
        int years = sc.nextInt();

        // Check bonus eligibility
        if (years > 5) {
            double bonus = salary * 0.05; // 5% bonus
            System.out.println("The bonus amount is: " + bonus);
        } else {
            System.out.println("No bonus. Years of service is less than or equal to 5.");
        }

        sc.close();
    }
}
