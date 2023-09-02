package ArrayProgram;

public class DeleteNo {
	public static void main(String args[]) {
		int[] a = { 5, 10, 15, 17, 20, 25 };
		int deleteNo = 20;
		int count = 0;
		for (int i = 0; i < a.length; i++) {
			if (deleteNo == a[i]) {
				for (int j = i; j < a.length - 1; j++) {
					a[j] = a[j + 1];
				}
				count++;
				break;
			}
		}
		if (count == 0) {
			System.out.print("No is not found ");
		} else {
			System.out.println("No deleted successfully");

			for (int i = 0; i < a.length - 1; i++) {
				System.out.print(a[i] + " ");
			}
		}
	}
}
