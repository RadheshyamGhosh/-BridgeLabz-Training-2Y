import java.util.Scanner;

public class CalendarDisplay {

    // Return month name for given month number 1..12
    public static String getMonthName(int m) {
        String[] months = {
            "January","February","March","April","May","June",
            "July","August","September","October","November","December"
        };
        if (m < 1 || m > 12) return "Invalid";
        return months[m-1];
    }

    // Return true if year is leap (Gregorian)
    public static boolean isLeapYear(int y) {
        return (y % 400 == 0) || (y % 4 == 0 && y % 100 != 0);
    }

    // Return number of days in a given month/year
    public static int daysInMonth(int m, int y) {
        int[] days = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
        if (m == 2 && isLeapYear(y)) return 29;
        return days[m-1];
    }

    // Gregorian algorithm from the hint to compute the day of week for d,m,y
    // Returns 0=Sunday,1=Monday,...6=Saturday
    public static int firstDayOfMonth(int m, int y) {
        int d = 1; // first day of month
        int y0 = y - (14 - m) / 12;
        int x  = y0 + y0/4 - y0/100 + y0/400;
        int m0 = m + 12 * ((14 - m) / 12) - 2;
        int d0 = (d + x + (31 * m0) / 12) % 7;
        // ensure non-negative
        return (d0 + 7) % 7;
    }

    public static void printCalendar(int m, int y) {
        if (m < 1 || m > 12) {
            System.out.println("Invalid month. Use 1..12.");
            return;
        }

        String monthName = getMonthName(m);
        System.out.printf("     %s %d%n", monthName, y);
        System.out.println("Sun Mon Tue Wed Thu Fri Sat");

        int first = firstDayOfMonth(m, y);   // 0..6
        int days = daysInMonth(m, y);

        // print initial indentation (each slot width 4 or use %4s). We'll use "%4s" but day uses "%3d".
        for (int i = 0; i < first; i++) {
            System.out.print("    ");
        }

        for (int d = 1; d <= days; d++) {
            System.out.printf("%3d ", d); // width 3 plus a space
            // move to next line after Saturday
            if ((first + d) % 7 == 0) System.out.println();
        }
        System.out.println(); // final newline
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter month (1-12): ");
        int m = sc.nextInt();
        System.out.print("Enter year (e.g. 2025): ");
        int y = sc.nextInt();
        printCalendar(m, y);
        sc.close();
}
}