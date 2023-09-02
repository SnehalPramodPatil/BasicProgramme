package ExceptionHandling;

import java.util.Scanner;

public class UncheckedException {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first Number");
		int a = sc.nextInt();
		System.out.println("Enter second Number");
		int b = sc.nextInt();

		try {
			int c = a / b;
		} catch (ArithmeticException e) {
			System.out.println("Cant divide by Zero");
			System.out.println(e);
		}

		System.out.println("Program continue......");
	}
}
