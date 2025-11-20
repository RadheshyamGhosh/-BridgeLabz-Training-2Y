package Transactionmanager;


public class Runner {
	public static void main(String[] args) {
		remainingLimit r = new remainingLimit();
		
		Double l1 = 5000.0;     
	    double u1 = 1200.0;

	    Double l2 = null;       
	    double u2 = 300.0;

	    System.out.println(r.L(l1, u1));
        System.out.println(r.L(l2, u2));
	}
}