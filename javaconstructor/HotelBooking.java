public class HotelBooking {
    private String guestName, roomType;
    private int nights;
    private double totalPrice;

    // Default constructor
    public HotelBooking() {
        this("Guest", "Standard", 1);
    }

    // Parameterized constructor
    public HotelBooking(String guestName, String roomType, int nights) {
        this.guestName = guestName;
        this.roomType = roomType;
        this.nights = nights;
        this.totalPrice = calculatePrice();
    }

    // Copy constructor
    public HotelBooking(HotelBooking other) {
        this(other.guestName, other.roomType, other.nights);
    }

    // Encapsulated logic
    private double calculatePrice() {
        double rate = switch (roomType.toLowerCase()) {
            case "suite" -> 250.0;
            case "deluxe" -> 150.0;
            default -> 100.0;
        };
        return rate * nights;
    }

    // Display method
    public void display() {
        System.out.println(guestName + " | " + roomType + " | " + nights + " nights | $" + totalPrice);
    }

    // Main method to test
    public static void main(String[] args) {
        new HotelBooking().display();
        new HotelBooking("Alice", "Suite", 3).display();
        new HotelBooking(new HotelBooking("Bob", "Deluxe", 2)).display();
    }
}
