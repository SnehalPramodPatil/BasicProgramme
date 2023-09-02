package ArrayMethod;

public class EvenOdd1 {

	public static void findEvenOdd(int arr[]) {
		// int a[] = new int[arr.length];
		// int index=0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 2 == 0) {
				// a[index]=arr[i];
				// index++;
				System.out.print(arr[i] + ",");
			}
		}
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 2 != 0) {
				// a[index]=arr[i];
				// index++;
				System.out.print(arr[i] + ",");
			}
		}
	}

	public static void main(String args[]) {
		int arr[] = { 2, 8, 5, 7, 9, 3, 10, 12, 15 };
		findEvenOdd(arr);
	}
}
