package ArrayProgram;
import java.util.Scanner;

public class PrimeNo {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		// int[] a = { 15, 11, 16, 21, 29 };
		int primecount=0;
		System.out.println("Enter size of array");
		int n = sc.nextInt();
		int[] a = new int[n];
		System.out.println("Enter the array elements");
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}
		for (int i = 0; i < n; i++) {
			int count = 0;
			for (int j = 1; j <= a[i]; j++) {
				if (a[i] % j == 0) {
					count++;
				}
			}

			if (count == 2) {
				primecount++;
				System.out.println(a[i] + " " + "is a prime no");
			}
			else {
				System.out.println(a[i] + " " + "is not a prime no");
			}
		}
		System.out.println("Total Prime no count is: "+primecount);
	}
}
