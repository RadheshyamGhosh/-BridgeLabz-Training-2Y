package ecommerce_app;

import java.util.*;

public class Shopping_cart {
	public static void main(String[] args) {
		HashMap<String,String> L = new HashMap<>();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of items:");
		int a = sc.nextInt();
		 sc.nextLine();
		 while (a > 0) {
	            System.out.println("Name of item: ");
	            String b = sc.nextLine();

	            System.out.println("Price of the item: ");
	            String c = sc.nextLine();

	            L.put(b, c);
	            a--;
	        }
		 int t = 0;
		 for (String ptr : L.values()) {
	            
	            try {
	                int p = Integer.parseInt(ptr);
	                t += p;
	            } catch (NumberFormatException e) {
	                System.out.println("Invalid price skipped: " + ptr);
	            }
	        }

	        System.out.println("Total Price = " + t);
		sc.close();
	}
}
