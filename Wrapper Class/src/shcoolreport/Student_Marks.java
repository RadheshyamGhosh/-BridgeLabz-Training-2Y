package shcoolreport;

import java.util.*;

public class Student_Marks {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of students:");
		int a = sc.nextInt();
		ArrayList<Integer> L = new ArrayList<>();
		int rr=0; 
		int sf =0;
		for(int i=0; i<a; i++) {
		try {
			int da = sc.nextInt();
			L.add(Integer.valueOf(da));
			rr+=da;
			sf+=1;
        } catch (NumberFormatException e) {
        	continue;	        
	    }catch(NullPointerException e) {
	    	continue;
	    }
		}
		System.out.println("Valid Marks: " + L);
		System.out.println("Average Marks: " + rr/sf);
		sc.close();
	}
}