package accessmodifier;

class Book {
    public String ISBN;
    protected String title;
    private String author;

    public Book(String ISBN, String title, String author) {
        this.ISBN = ISBN;
        this.title = title;
        this.author = author;
    }

    // Getter for author
    public String getAuthor() {
        return author;
    }

    // Setter for author
    public void setAuthor(String author) {
        this.author = author;
    }
}

class EBook extends Book {
    private double fileSizeMB;

    public EBook(String ISBN, String title, String author, double fileSizeMB) {
        super(ISBN, title, author);
        this.fileSizeMB = fileSizeMB;
    }

    public void displayEBookInfo() {
        // Access public and protected members directly
        System.out.println("ISBN: " + ISBN);
        System.out.println("Title: " + title);
        // Can't access 'author' directly because it's private
        System.out.println("Author: " + getAuthor());
        System.out.println("File Size: " + fileSizeMB + " MB");
    }
}

public class LibrarySystem {
    public static void main(String[] args) {
        EBook ebook = new EBook("123-456-789", "Java Basics", "John Doe", 2.5);
        ebook.displayEBookInfo();

        // Change author using setter
        ebook.setAuthor("Jane Smith");
        System.out.println("Updated Author: " + ebook.getAuthor());
    }
}
