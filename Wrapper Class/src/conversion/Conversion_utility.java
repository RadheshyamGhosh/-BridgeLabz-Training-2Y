package conversion;


public class Conversion_utility {
	public static void main(String[] args) {
		ParseInt b = new ParseInt();
		System.out.println(b.con("123"));	
		System.out.println(b.con("0"));	
		System.out.println(b.con("45.6"));	
		System.out.println(b.con("abc"));	
	}
}