package javaconstructor;

public class Books {
    private String title, author;
    private double price;
    private boolean available;

    // Constructor
    public Books(String title, String author, double price, boolean available) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.available = available;
    }

    // Borrow book method
    public void borrowBook() {
        if (available) {
            available = false;
            System.out.println("You borrowed \"" + title + "\" by " + author);
        } else {
            System.out.println("Sorry, \"" + title + "\" is not available.");
        }
    }

    // Display book info
    public void display() {
        System.out.println(title + " by " + author + " | $" + price + " | " +
                (available ? "Available" : "Not Available"));
    }

    // Test in main method
    public static void main(String[] args) {
        Books book1 = new Books("1984", "George Orwell", 12.99, true);
        Books book2 = new Books("To Kill a Mockingbird", "Harper Lee", 10.50, false);

        book1.display();
        book1.borrowBook();
        book1.display();

        System.out.println();

        book2.display();
        book2.borrowBook();
    }
}
