import java.util.Scanner;

public class QuadraticRoots {

    // Method to find roots of quadratic equation
    public static double[] findRoots(double a, double b, double c) {
        double delta = Math.pow(b, 2) - 4 * a * c; // discriminant

        if (delta > 0) {  // Two roots
            double root1 = (-b + Math.sqrt(delta)) / (2 * a);
            double root2 = (-b - Math.sqrt(delta)) / (2 * a);
            return new double[]{root1, root2};
        } else if (delta == 0) {  // One root
            double root = -b / (2 * a);
            return new double[]{root};
        } else {  // No real roots
            return new double[]{}; 
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // User input
        System.out.print("Enter value of a: ");
        double a = sc.nextDouble();
        System.out.print("Enter value of b: ");
        double b = sc.nextDouble();
        System.out.print("Enter value of c: ");
        double c = sc.nextDouble();

        // Find roots
        double[] roots = findRoots(a, b, c);

        // Display result
        if (roots.length == 2) {
            System.out.println("Two roots: " + roots[0] + " and " + roots[1]);
        } else if (roots.length == 1) {
            System.out.println("One root: " + roots[0]);
        } else {
            System.out.println("No real roots exist.");
        }

        sc.close();
    }
}
