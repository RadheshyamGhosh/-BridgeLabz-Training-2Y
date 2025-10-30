import java.util.*;

class Product {
    String name; double price, rating, discount;
    Product(String n, double p, double r, double d) { name=n; price=p; rating=r; discount=d; }
    public String toString() { return name+" | ₹"+price+" | ★"+rating+" | "+discount+"% off"; }
}

public class ECommerceSorting {
    public static void main(String[] args) {
        List<Product> p = Arrays.asList(
            new Product("Laptop",60000,4.5,10),
            new Product("Phone",30000,4.7,15),
            new Product("Headphones",2000,4.2,25)
        );

        System.out.println("-- Sort by Price --");
        p.sort((a,b)->Double.compare(a.price,b.price)); p.forEach(System.out::println);

        System.out.println("\n-- Sort by Rating --");
        p.sort((a,b)->Double.compare(b.rating,a.rating)); p.forEach(System.out::println);

        System.out.println("\n-- Sort by Discount --");
        p.sort((a,b)->Double.compare(b.discount,a.discount)); p.forEach(System.out::println);
    }
}
