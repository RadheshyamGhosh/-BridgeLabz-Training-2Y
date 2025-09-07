import java.util.Scanner;

public class Handshakes {
    static int calculateHandshakes(int n) {
        return (n * (n - 1)) / 2;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of students: ");
        int numberOfStudents = sc.nextInt();

        if (numberOfStudents > 1) {
            int maxHandshakes = calculateHandshakes(numberOfStudents);
            System.out.println("The maximum number of possible handshakes is: " + maxHandshakes);
        } else {
            System.out.println("At least 2 students are required for a handshake.");
        }

        sc.close();
    }
}
