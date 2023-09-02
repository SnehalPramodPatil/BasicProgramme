package ExceptionHandling;

import java.util.Scanner;

public class MultipleCatchBlock {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter No");
		int a = sc.nextInt();
		int arr[] = { 3, 5, 2, 9, 8 };
		int result = 0;

		try {
			result = arr[5] / a;
		} catch (ArithmeticException e) {
			System.out.println("Arithmetic Exception");
		} catch (IndexOutOfBoundsException e) {
			System.out.println("Index out of bounds Exception");
		} catch (Exception e) {
			System.out.println("Exception");
		}

		System.out.println("result: " + result);
		System.out.println("Program Continue");
	}
}
