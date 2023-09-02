package ExceptionHandling;

import java.util.Scanner;

public class FinallyBlock {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter No");
		int a = sc.nextInt();
		int result = 0;
		int arr[] = { 5, 4, 2, 9 };

		try {
			result = arr[1] / a;
		} catch (ArithmeticException e) {
			System.out.println(e);
		} finally {
			sc.close();

			System.out.println("Compulsory finally block gets executed");
		}

		System.out.println("resulr=" + result);

		System.out.println("program continue");
	}

}
