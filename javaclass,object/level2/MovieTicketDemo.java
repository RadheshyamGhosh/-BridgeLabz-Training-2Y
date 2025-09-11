class MovieTicket {
    String movieName;
    String seatNumber;
    double price;

    // Method to book a ticket
    void bookTicket(String movieName, String seatNumber, double price) {
        this.movieName = movieName;
        this.seatNumber = seatNumber;
        this.price = price;
        System.out.println("Ticket booked successfully!\n");
    }

    // Method to display ticket details
    void displayTicket() {
        System.out.println("----- Ticket Details -----");
        System.out.println("Movie Name : " + movieName);
        System.out.println("Seat Number: " + seatNumber);
        System.out.println("Price       : $" + price);
        System.out.println("---------------------------\n");
    }
}

public class MovieTicketDemo {
    public static void main(String[] args) {
        // Create ticket objects
        MovieTicket ticket1 = new MovieTicket();
        MovieTicket ticket2 = new MovieTicket();

        // Book tickets
        ticket1.bookTicket("Avengers: Endgame", "A12", 250.0);
        ticket2.bookTicket("KGF Chapter 2", "B7", 300.0);

        // Display ticket details
        ticket1.displayTicket();
        ticket2.displayTicket();
    }
}
