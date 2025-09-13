package javaconstructor;
public class CarRental {
    private String customerName, carModel;
    private int rentalDays;
    private double totalCost;

    // Default constructor
    public CarRental() {
        this("Customer", "Standard", 1);
    }

    // Parameterized constructor
    public CarRental(String customerName, String carModel, int rentalDays) {
        this.customerName = customerName;
        this.carModel = carModel;
        this.rentalDays = rentalDays;
        this.totalCost = calculateCost();
    }

    // Private method to calculate cost
    private double calculateCost() {
        double rate = switch (carModel.toLowerCase()) {
            case "suv" -> 70.0;
            case "luxury" -> 100.0;
            default -> 50.0;
        };
        return rate * rentalDays;
    }

    // Display rental details
    public void display() {
        System.out.println(customerName + " rented " + carModel + " for " +
                rentalDays + " days. Total: $" + totalCost);
    }

    // Main method to test
    public static void main(String[] args) {
        new CarRental().display();
        new CarRental("Alice", "SUV", 3).display();
        new CarRental("Bob", "Luxury", 2).display();
    }
}
