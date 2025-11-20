package autoboxingunboxing;

import java.util.*;

public class List {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> L = new ArrayList<>();
		for(int i =0; i<5; i++) {
			Integer a = sc.nextInt();
			L.add(a);
		}
		int b =0;
		for(Integer a : L) {
			b += a.intValue();
		}
		System.out.println("Sum of numbers: "+ b);
		sc.close();
	}
}