public class Product {
    private final String productName;
    private final double price;

    private static int totalProducts = 0;

    // Constructor
    public Product(String productName, double price) {
        this.productName = productName;
        this.price = price;
        totalProducts++; // Increment total when new product is created
    }

    // Instance method
    public void displayProductDetails() {
        System.out.println("Product Name: " + productName + ", Price: $" + price);
    }

    // Static method (class method)
    public static void displayTotalProducts() {
        System.out.println("Total Products: " + totalProducts);
    }

    // Main method to test functionality
    public static void main(String[] args) {
        Product p1 = new Product("Laptop", 1200.0);
        Product p2 = new Product("Phone", 800.0);

        // Display individual product details
        p1.displayProductDetails();
        p2.displayProductDetails();

        // Display total number of products
        Product.displayTotalProducts();
    }
}
