package ArrayMethod;

public class PositiveNegativeNo {
	public static void findPositiveNegative(int arr[]) {
		int c1 = 0, c2 = 0; 
		System.out.println("positive no in given array are ");
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > 0) {
				c1++;
				System.out.println(arr[i]+" ");
			} 
		}
		System.out.println("negative no in given array are ");
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] <0) {
				c2++;
				System.out.println(arr[i]+" ");
			} 
		}
		
		System.out.println("total positive no is "+c1);
		System.out.println("total negative no is "+c2);
	}

	public static void main(String args[]) {
		int arr[] = { 5, 2, -4, 6, -10, -12, 15, 32, -45, -78, 20, 36 };
		findPositiveNegative(arr);
	}
}
