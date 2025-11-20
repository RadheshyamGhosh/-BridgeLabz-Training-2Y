package productratinganalyzer;

import java.util.ArrayList;
import java.util.Arrays;

public class Analyze {
	public static void main(String[] args) {
		int[] pr = {4, 5, 3, 5};
		ArrayList<Integer> or = new ArrayList<>(Arrays.asList(5, null, 4, null, 3));
		ArrayList<Integer> ar = new ArrayList<>();
		
		for (int r : pr) {
            ar.add(r);
        }

        for (Integer r : or) {
            if (r != null) {
                ar.add(r);
            }
        }
        
        int a =0;
        int q=0;
        for(Integer e : ar) {
        	a +=e;
        	q+=1;
        }
        
        System.out.println("Combined Ratings: " + ar);
        System.out.println("Average Rating: " + a/q);     
		
	}
}