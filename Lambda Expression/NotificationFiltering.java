import java.util.*;
import java.util.function.Predicate;

class Alert {
    String type; String message;
    Alert(String t, String m) { type=t; message=m; }
    public String toString() { return type + ": " + message; }
}

public class NotificationFiltering {
    public static void main(String[] args) {
        List<Alert> alerts = Arrays.asList(
            new Alert("Critical", "Low oxygen level!"),
            new Alert("Normal", "Regular checkup reminder."),
            new Alert("Emergency", "Heart rate abnormal!"),
            new Alert("Info", "New health tip available.")
        );

        Predicate<Alert> criticalOnly = a -> a.type.equals("Critical") || a.type.equals("Emergency");
        System.out.println("-- Filtered Alerts --");
        alerts.stream().filter(criticalOnly).forEach(System.out::println);
    }
}
