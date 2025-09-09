import java.util.Scanner;

public class CollinearPoints {

    // Method 1: Using slope formula
    public static boolean areCollinearSlope(int x1, int y1, int x2, int y2, int x3, int y3) {
        // Slope comparison without dividing (to avoid division by zero)
        return (y2 - y1) * (x3 - x1) == (y3 - y1) * (x2 - x1);
    }

    // Method 2: Using area of triangle formula
    public static boolean areCollinearArea(int x1, int y1, int x2, int y2, int x3, int y3) {
        int area = x1 * (y2 - y3) + x2 * (y3 - y1) + x3 * (y1 - y2);
        return area == 0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking input
        System.out.print("Enter x1 y1: ");
        int x1 = sc.nextInt(), y1 = sc.nextInt();

        System.out.print("Enter x2 y2: ");
        int x2 = sc.nextInt(), y2 = sc.nextInt();

        System.out.print("Enter x3 y3: ");
        int x3 = sc.nextInt(), y3 = sc.nextInt();

        // Using slope formula
        if (areCollinearSlope(x1, y1, x2, y2, x3, y3)) {
            System.out.println("Points are Collinear (by slope method).");
        } else {
            System.out.println("Points are NOT Collinear (by slope method).");
        }

        // Using area formula
        if (areCollinearArea(x1, y1, x2, y2, x3, y3)) {
            System.out.println("Points are Collinear (by area method).");
        } else {
            System.out.println("Points are NOT Collinear (by area method).");
        }

        sc.close();
}
}