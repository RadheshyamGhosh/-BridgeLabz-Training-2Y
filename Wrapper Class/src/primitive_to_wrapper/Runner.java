package primitive_to_wrapper;

import java.util.*;

public class Runner {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		Integer o = n;
		System.out.println("Primitive form "+n);
		System.out.println("Objective form "+o.toString());
		sc.close();
	}
}