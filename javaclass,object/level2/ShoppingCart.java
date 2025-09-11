import java.util.ArrayList;

class CartItem {
    String itemName;
    double price;
    int quantity;

    CartItem(String itemName, double price, int quantity) {
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }

    double getTotalPrice() {
        return price * quantity;
    }
}

public class ShoppingCart {
    public static void main(String[] args) {
        ArrayList<CartItem> cart = new ArrayList<>();

        // Adding items
        cart.add(new CartItem("Apple", 20.5, 2));
        cart.add(new CartItem("Milk", 35.0, 1));
        cart.add(new CartItem("Bread", 25.0, 3));

        // Removing one item (example: remove Milk)
        cart.remove(1);

        // Display total cost
        double total = 0;
        System.out.println("Cart Items:");
        for (CartItem item : cart) {
            System.out.println(item.itemName + " x " + item.quantity + " = " + item.getTotalPrice());
            total += item.getTotalPrice();
        }
        System.out.println("Total Cost = " + total);
    }
}
