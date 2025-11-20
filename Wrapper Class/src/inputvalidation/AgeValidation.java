package inputvalidation;

import java.util.Scanner;

public class AgeValidation {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try {
	        int age = Integer.parseInt(sc.nextLine()); 

	        if (age >= 18) {
	            System.out.println(true);  
	        } else {
	        	System.out.println(false); 
	        }

	    } catch (NumberFormatException e) {
        	System.out.println(false);
	    }
		sc.close();
	}

}
