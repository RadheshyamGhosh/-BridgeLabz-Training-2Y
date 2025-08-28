import java.util.Scanner;

public class FriendsAgeHeight {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input ages
        System.out.print("Enter Amar's age: ");
        int amarAge = sc.nextInt();
        System.out.print("Enter Akbar's age: ");
        int akbarAge = sc.nextInt();
        System.out.print("Enter Anthony's age: ");
        int anthonyAge = sc.nextInt();

        // Input heights
        System.out.print("Enter Amar's height: ");
        int amarHeight = sc.nextInt();
        System.out.print("Enter Akbar's height: ");
        int akbarHeight = sc.nextInt();
        System.out.print("Enter Anthony's height: ");
        int anthonyHeight = sc.nextInt();

        // Find youngest
        int youngest = Math.min(amarAge, Math.min(akbarAge, anthonyAge));
        if (youngest == amarAge) System.out.println("Youngest: Amar (" + amarAge + ")");
        else if (youngest == akbarAge) System.out.println("Youngest: Akbar (" + akbarAge + ")");
        else System.out.println("Youngest: Anthony (" + anthonyAge + ")");

        // Find tallest
        int tallest = Math.max(amarHeight, Math.max(akbarHeight, anthonyHeight));
        if (tallest == amarHeight) System.out.println("Tallest: Amar (" + amarHeight + ")");
        else if (tallest == akbarHeight) System.out.println("Tallest: Akbar (" + akbarHeight + ")");
        else System.out.println("Tallest: Anthony (" + anthonyHeight + ")");

        sc.close();
    }
}
