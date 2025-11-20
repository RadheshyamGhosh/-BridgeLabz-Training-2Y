package character_wrapper_use_case;

import java.util.*;

public class Counter {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String a = sc.nextLine();
		int b = 0;
		int c = 0;
		int d = 0;
		for(int i =0; i<a.length(); i++){
			char e = a.charAt(i);
			if(Character.isLetter(e)) {
				b+=1;
			}else if(Character.isDigit(e)) {
				c+=1;
			}else if(Character.isWhitespace(e)) {
				d+=1;
			}
		}
		System.out.println("Letter Count "+b);
		System.out.println("Digit Count "+c);
		System.out.println("Whitespace Count "+d);
		sc.close();
	}
}