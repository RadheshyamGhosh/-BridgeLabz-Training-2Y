package utility;

public class Runner {
	public static void main(String[] args) {
		System.out.println("String to int: " + Integer.parseInt("123"));
		System.out.println("String to double: " + Double.parseDouble("3.14"));
		System.out.println("String to boolean: " + Boolean.parseBoolean("true"));
		System.out.println("String to binary: " +Integer.toBinaryString(10));
		System.out.println("String to double: " +Character.isDigit('5'));
		System.out.println("Case change: " +Character.toUpperCase('a'));
	}

}
