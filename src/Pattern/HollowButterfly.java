package Pattern;

public class HollowButterfly {
	public static void main(String args[]) {
		int n = 6;
		// Upper half
		for (int i = 1; i <= n; i++) {
			// 1st side
			for (int j = 1; j <= i; j++) {
				if (j == 1 || j == i)
				{
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			for (int j = 1; j <= 2 * (n - i); j++) // spaces
			{
				System.out.print(" ");
			}
			// 2nd side
			for (int j = 1; j <= i; j++) {
				if (j == 1 || j == i) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}

			}
			System.out.println("");
		}
		// Lower half
		for (int i = n; i >= 1; i--) {
			for (int j = 1; j <= i; j++) {
				if (j == 1 || j == i) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			for (int j = 1; j <= 2 * (n - i); j++) {
				System.out.print(" ");
			}
			for (int j = 1; j <= i; j++) {
				if (j == 1 || j == i) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}

			}
			System.out.println("");
		}
	}
}
