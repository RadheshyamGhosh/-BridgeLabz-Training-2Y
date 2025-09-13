package javaconstructor;
class Book {
    String title;
    String author;
    double price;

    // Default constructor
    Book() {
        this.title = "Unknown";
        this.author = "Unknown";
        this.price = 0.0;
    }

    // Parameterized constructor
    Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    // Method to display details
    void displayDetails() {
        System.out.println("Title: " + title + ", Author: " + author + ", Price: " + price);
    }

    public static void main(String[] args) {
        // Using default constructor
        Book b1 = new Book();
        b1.displayDetails();

        // Using parameterized constructor
        Book b2 = new Book("Java Basics", "James Gosling", 499.99);
        b2.displayDetails();
    }
}
