package methodsreferance;

import java.util.*;

public class NameUppercasing {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Rahul", "Priya", "Aman", "Neha");

        System.out.println("-- Uppercase Names --");
        names.stream().map(String::toUpperCase).forEach(System.out::println);
    }
}
