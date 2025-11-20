package collectionofobjects;

import java.util.ArrayList;

public class Doublefromdouble {
	public static void main(String[] args) {
		double[] prices = {10.5, 20.0, 35.75, 5.5};
		ArrayList<Double> b = new ArrayList<>();
		for(double i : prices) {
		    Double a = Double.valueOf(i);
		    b.add(a);
		}
		Double c = Double.valueOf(0);
		Double d = Double.valueOf(0);
		
		for(double j : b) {
			d += j;
			if(c<j) {c =j;}
			}
		System.out.println(c);
		System.out.println(d);
		
	}
}
