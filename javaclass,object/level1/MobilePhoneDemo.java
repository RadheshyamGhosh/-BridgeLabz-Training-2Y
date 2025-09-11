import java.util.Random;

class MobilePhone {
    String brand;
    String model;
    double price;

    // Constructor
    MobilePhone(String brand, String model) {
        this.brand = brand;
        this.model = model;

        // Assign random price between 10,000 and 80,000
        Random rand = new Random();
        this.price = 10000 + rand.nextInt(30001);
    }

    // Method to display phone details
    void displayDetails() {
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Price: $" + price);
        System.out.println("-------------------------");
    }
}

public class MobilePhoneDemo {
    public static void main(String[] args) {
        // Create MobilePhone objects
        MobilePhone phone1 = new MobilePhone("Samsung", "Galaxy S23");
        MobilePhone phone2 = new MobilePhone("Apple", "iPhone 14");
        MobilePhone phone3 = new MobilePhone("OnePlus", "OnePlus 11");

        // Display details of each phone
        phone1.displayDetails();
        phone2.displayDetails();
        phone3.displayDetails();
    }
}
