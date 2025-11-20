package employeedataprocessing;

import java.util.ArrayList;
import java.util.Collections;

public class HR_analytics {
	public static void main(String[] args) {
		int[] a = {78,87,89,46,85,6854,687,87,47};
		ArrayList<Integer> b = new ArrayList<>();
		for(int i : a) {
			b.add(Integer.valueOf(i));
		}
		int y = Collections.min(b);
        int o = Collections.max(b);

        System.out.println("Employee Ages: " + b);
        System.out.println("Youngest Employee Age: " + y);
        System.out.println("Oldest Employee Age: " + o);
	}
}