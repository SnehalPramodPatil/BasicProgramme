package ArrayProgram;

import java.util.Scanner;

public class FindEvenOddNo {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		// int[] arr = { 10, 11, 14, 17, 20, 29 };
		int n,count1=0,count2=0,product1=1,product2=1;
		System.out.println("Enter the size of array");
		n = sc.nextInt();
		int[] arr = new int[n];
		System.out.println("Enter Array Elements: ");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
	
		System.out.println("Even Elements are:");
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 2 == 0) {
				count1++;
				product1=product1*arr[i];
				System.out.println(arr[i] + " ");
			}
		}
		System.out.println("Even no count is: "+count1);
		System.out.println("Product of even no is: "+product1);

		System.out.println("Odd Elements are:");
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 2 != 0) {
				count2++;
				product2=product2*arr[i];
				System.out.println(arr[i] + " ");
			}
		}
		System.out.println("odd no count is: "+count2);
		System.out.println("Product of odd no is: "+product2);
	}
}
