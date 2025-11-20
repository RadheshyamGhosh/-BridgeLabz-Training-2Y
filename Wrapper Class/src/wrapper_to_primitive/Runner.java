package wrapper_to_primitive;

public class Runner {
	public static void main(String[] args) {
		Double o = 45.67;
		double d = o;
		int i = o.intValue();
		System.out.println("Double object " + o);
		System.out.println("double value " + d);
		System.out.println("int value " + i);
	}
}