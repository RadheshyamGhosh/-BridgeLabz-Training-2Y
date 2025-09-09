import java.util.Random;

public class EmployeeBonusCalculator {

    // Method to generate salary (5-digit) and years of service
    public static int[][] generateEmployeeData(int n) {
        Random rand = new Random();
        int[][] data = new int[n][2]; // [salary, yearsOfService]

        for (int i = 0; i < n; i++) {
            int salary = 10000 + rand.nextInt(90000); // 5-digit salary
            int years = 1 + rand.nextInt(15); // random years (1–15)
            data[i][0] = salary;
            data[i][1] = years;
        }
        return data;
    }

    // Method to calculate bonus and new salary
    public static double[][] calculateBonus(int[][] empData) {
        int n = empData.length;
        double[][] result = new double[n][2]; // [bonus, newSalary]

        for (int i = 0; i < n; i++) {
            int salary = empData[i][0];
            int years = empData[i][1];

            double bonusPercent = (years > 5) ? 0.05 : 0.02;
            double bonus = salary * bonusPercent;
            double newSalary = salary + bonus;

            result[i][0] = bonus;
            result[i][1] = newSalary;
        }
        return result;
    }

    // Method to display results in tabular format
    public static void displayResults(int[][] empData, double[][] bonusData) {
        int n = empData.length;
        double totalOldSalary = 0, totalNewSalary = 0, totalBonus = 0;

        System.out.printf("%-5s %-10s %-10s %-12s %-12s %-12s%n", 
                          "ID", "Salary", "Service", "Bonus", "New Salary", "Bonus %");
        System.out.println("-------------------------------------------------------------------");

        for (int i = 0; i < n; i++) {
            int salary = empData[i][0];
            int years = empData[i][1];
            double bonus = bonusData[i][0];
            double newSalary = bonusData[i][1];
            double bonusPercent = (years > 5) ? 5 : 2;

            System.out.printf("%-5d %-10d %-10d %-12.2f %-12.2f %-12.0f%%%n",
                              (i + 1), salary, years, bonus, newSalary, bonusPercent);

            totalOldSalary += salary;
            totalNewSalary += newSalary;
            totalBonus += bonus;
        }

        System.out.println("-------------------------------------------------------------------");
        System.out.printf("%-5s %-10.2f %-10s %-12.2f %-12.2f %-12s%n", 
                          "SUM", totalOldSalary, "", totalBonus, totalNewSalary, "");
    }

    public static void main(String[] args) {
        int[][] empData = generateEmployeeData(10);   // Step b
        double[][] bonusData = calculateBonus(empData); // Step c
        displayResults(empData, bonusData);             // Step d
}
}