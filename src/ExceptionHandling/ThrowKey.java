package ExceptionHandling;

import java.util.Scanner;

public class ThrowKey {
	static void validateVoter(int age) {
		if (age < 18) {
			throw new ArithmeticException("user is not eligible to vote");
		} else {
			System.out.println("Welcome you are eligible");
		}
	}

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your age");
		int age = sc.nextInt();
		validateVoter(age);
	}
}
