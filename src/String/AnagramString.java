package String;
import java.util.Scanner;

public class AnagramString {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first string");
		String s1 = sc.next();
		System.out.println("Enter second string");
		String s2 = sc.next();
		int a1 = 0, a2 = 0;
		if (s1.length() == s2.length()) {
			for (int i = 0; i < s1.length(); i++) {
				a1 = a1 + s1.charAt(i);
			}

			for (int i = 0; i < s2.length(); i++) {
				a2 = a2 + s2.charAt(i);
			}
		}
																	
		if (a1 == a2) {
			System.out.println(s1 + " and " + s2 + " are Anagrams");
		} else {
			System.out.println(s1 + "and " + s2 + " are not Anagrams");
		}
	}
}
