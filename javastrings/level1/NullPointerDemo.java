public class NullPointerDemo {

    // Method to generate NullPointerException (no handling)
    public static void generateException() {
        String text = null; // initialized to null
        System.out.println("Length of text: " + text.length()); // will throw NullPointerException
    }

    // Method to demonstrate handling NullPointerException
    public static void handleException() {
        String text = null;
        try {
            System.out.println("Length of text: " + text.length());
        } catch (NullPointerException e) {
            System.out.println("Caught NullPointerException: Cannot access methods on a null object!");
        }
    }

    public static void main(String[] args) {
        System.out.println("=== Generating Exception (without handling) ===");
        try {
            generateException(); // This will crash if not in try-catch
        } catch (Exception e) {
            System.out.println("Exception occurred: " + e);
        }

        System.out.println("\n=== Handling Exception with try-catch ===");
        handleException();
}
}