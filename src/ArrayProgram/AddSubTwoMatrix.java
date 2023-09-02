package ArrayProgram;

public class AddSubTwoMatrix {
	public static void main(String args[]) {
		int[][] a = { { 2, 5, 8 }, { 5, 2, 1 } };
		int[][] b = { { 1, 7, 6 }, { 0, 3, 9 } };

		System.out.println("Addition of two matrix is");

		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 3; j++) {

				System.out.print(a[i][j] + b[i][j] + " ");
			}
			System.out.println();
		}
		

		System.out.println("Subtraction of two matrix is");

		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 3; j++) {

				System.out.print(a[i][j] - b[i][j] + " ");
			}
			System.out.println();
		}
	}
}
