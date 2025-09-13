public class Vehicle {
    // Instance variables
    private final String ownerName;
    private final String vehicleType;

    // Class variable (shared across all instances)
    private static double registrationFee = 100.0;

    // Constructor
    public Vehicle(String ownerName, String vehicleType) {
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
    }

    // Instance method to display vehicle details
    public void displayVehicleDetails() {
        System.out.println("Owner: " + ownerName);
        System.out.println("Vehicle Type: " + vehicleType);
        System.out.println("Registration Fee: $" + registrationFee);
        System.out.println();
    }

    // Class method to update registration fee
    public static void updateRegistrationFee(double newFee) {
        registrationFee = newFee;
    }

    // Main method to test
    public static void main(String[] args) {
        // Update registration fee before creating vehicles
        Vehicle.updateRegistrationFee(150.0);

        // Create vehicles
        Vehicle v1 = new Vehicle("Alice", "Car");
        Vehicle v2 = new Vehicle("Bob", "Motorcycle");

        // Display vehicle details
        v1.displayVehicleDetails();
        v2.displayVehicleDetails();

        // Change the registration fee again
        Vehicle.updateRegistrationFee(200.0);

        // Display updated fee with same vehicles
        v1.displayVehicleDetails();
        v2.displayVehicleDetails();
    }
}
