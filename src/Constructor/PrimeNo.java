package Constructor;
import java.util.Scanner;

public class PrimeNo {
	int n, count = 0;

	public PrimeNo(int n) {
		for (int i = 1; i <= n; i++) {
			if (n % i == 0) {
				count++;
			}
		}

		if (count == 2) {
			System.out.println(n + " " + "is a Prime No");
		} else {
			System.out.println(n + " " + "is not a Prime No");
		}

	}

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no");
		int n = sc.nextInt();
		PrimeNo p = new PrimeNo(n);

	}
}
