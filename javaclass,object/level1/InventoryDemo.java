import java.util.Random;

class Item {
    int itemCode;
    String itemName;
    double price;

    // Constructor with random input
    Item(int code, String name) {
        this.itemCode = code;
        this.itemName = name;
        Random rand = new Random();
        // Generate random price between 100 and 1000
        this.price = 100 + rand.nextInt(901);
    }

    // Method to display item details
    void displayDetails() {
        System.out.println("Item Code: " + itemCode);
        System.out.println("Item Name: " + itemName);
        System.out.println("Price: " + price);
    }

    // Method to calculate total cost for a given quantity
    double calculateTotalCost(int quantity) {
        return price * quantity;
    }
}

public class InventoryDemo {
    public static void main(String[] args) {
        // Creating items with random price
        Item item1 = new Item(101, "Laptop");
        Item item2 = new Item(102, "Headphones");

        // Display details
        item1.displayDetails();
        System.out.println("Total Cost for 3 Laptops: " + item1.calculateTotalCost(3));
        System.out.println();

        item2.displayDetails();
        System.out.println("Total Cost for 5 Headphones: " + item2.calculateTotalCost(5));
    }
}
