package ArrayProgram;

public class SumOfRowColumn {
	public static void main(String args[]) {
		int a[][] = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };

		System.out.println("Matrix is: ");
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.print(a[i][j] + " ");
			}
			System.out.println("");
		}

		for (int i = 0; i < 3; i++) {
			int sum1 = 0;
			for (int j = 0; j < 3; j++) {
				sum1 = sum1 + a[i][j];     //row no same column value change
			}
			System.out.println("Sum of row " + (i + 1) + " is: " + sum1);
		}

		System.out.println("");
		for (int i = 0; i < 3; i++) {
			int sum2 = 0;
			for (int j = 0; j < 3; j++) {
				sum2 = sum2 + a[j][i];    //column no same row value change
			}
			System.out.println("Sum of column " + (i + 1) + " is: " + sum2);
		}
	}
}
