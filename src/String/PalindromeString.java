package String;

import java.util.Scanner;

public class PalindromeString {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String");
		String str1 = sc.nextLine();
		String str2 = "";

		for (int i = str1.length() - 1; i >= 0; i--) {
			str2 = str2 + str1.charAt(i);
		}

		if (str1.equals(str2)) {
			System.out.println(str1+" "+"is a palindrome string");
		} else {
			System.out.println(str1+ " "+"is not a palindrome String");
		}
	}
}
