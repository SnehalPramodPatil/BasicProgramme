package ArrayProgram;

public class CopyElements {
	public static void main(String args[]) {
		int[] a ={ 1, 5, 8, 1, 6 };
		int[] b = new int[a.length];

		for (int i = 0; i < a.length; i++) {
			b[i] = a[i];
		}
		System.out.println("Elements of orignal array:");
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}

		System.out.println();

		System.out.println("Elements of copy array:");
		for (int i = 0; i < b.length; i++) {
			System.out.print(b[i] + " ");
		}
	}
}
