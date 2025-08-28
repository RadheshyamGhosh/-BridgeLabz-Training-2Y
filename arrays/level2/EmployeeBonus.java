import java.util.Scanner;

public class EmployeeBonus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = 10;  // number of employees

        double[] salary = new double[n];          // old salary
        int[] yearsService = new int[n];          // years of service
        double[] bonus = new double[n];           // bonus for each employee
        double[] newSalary = new double[n];       // salary after bonus

        double totalOldSalary = 0;
        double totalBonus = 0;
        double totalNewSalary = 0;

        // Step 1: Input salary and years of service
        for (int i = 0; i < n; i++) {
            System.out.println("Enter salary of employee " + (i + 1) + ": ");
            salary[i] = sc.nextDouble();

            if (salary[i] <= 0) {   // check salary validity
                System.out.println("Invalid salary! Enter again.");
                i--;
                continue;
            }

            System.out.println("Enter years of service of employee " + (i + 1) + ": ");
            yearsService[i] = sc.nextInt();

            if (yearsService[i] < 0) {  // check years validity
                System.out.println("Invalid years of service! Enter again.");
                i--;
                continue;
            }
        }

        // Step 2: Calculate bonus, new salary, totals
        for (int i = 0; i < n; i++) {
            if (yearsService[i] > 5) {
                bonus[i] = salary[i] * 0.05;   // 5% bonus
            } else {
                bonus[i] = salary[i] * 0.02;   // 2% bonus
            }

            newSalary[i] = salary[i] + bonus[i];

            totalOldSalary += salary[i];
            totalBonus += bonus[i];
            totalNewSalary += newSalary[i];
        }

        // Step 3: Display results
        System.out.println("\n--- Employee Salary Details ---");
        for (int i = 0; i < n; i++) {
            System.out.println("Employee " + (i + 1) + ": Old Salary = " + salary[i] +
                    ", Years of Service = " + yearsService[i] +
                    ", Bonus = " + bonus[i] +
                    ", New Salary = " + newSalary[i]);
        }

        System.out.println("\n--- Totals ---");
        System.out.println("Total Old Salary = " + totalOldSalary);
        System.out.println("Total Bonus = " + totalBonus);
        System.out.println("Total New Salary = " + totalNewSalary);

        sc.close();
    }
}
