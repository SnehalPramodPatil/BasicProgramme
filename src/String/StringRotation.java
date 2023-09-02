package String;
import java.util.Scanner;

public class StringRotation {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first string");
		String str1 = sc.next();
		System.out.println("Enter second string");
		String str2 = sc.next();
		String str3 = str1 + str1;

		if (str1.length() != str2.length()) {
			System.out.println("String are not rotation to each other");
		} else {
			if (str3.contains(str2)) {
				System.out.println("String are rotation to each other");
			} else {
				System.out.println("String are not rotation to each other");
			}
		}
	}
}
