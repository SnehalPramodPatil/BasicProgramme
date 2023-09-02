package ArrayProgram;

public class DuplicateElement {
	public static void main(String[] args) {
		int count = 0;
		int a[] = { 8, 9, 6, 5, 6, 4, 8, 2, 2, 10 };
		System.out.println("duplicate elements are: ");
		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] == a[j]) {
					// count++;
				
					System.out.println(a[j]);
				}
			}
		}
	}
}
