package ArrayProgram;

public class InsertoinSort {
	public static void main(String args[]) {
		int[] a = { 5, 1, 6, 2, 4, 3 };
		
		System.out.println("orignal array");
		for (int i = 0; i < a.length; i++) {    
			System.out.print(a[i] + " ");
		}
		
		int temp, j;
		for (int i = 1; i < a.length; i++) {    //1st element of array is assumed to be sorted take 2nd element n store it to temp
			temp = a[i];                        //campare temp with 1st element if 1st element is greater than temp then temp is
			j = i;                             //placed in front of 1st element

			while (j > 0 && a[j - 1] > temp) {
				a[j] = a[j - 1];
				j = j - 1;
			}
			a[j] = temp;
		}
		System.out.println();
		System.out.println("Sorted array");
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
	}
}               //time complexity  best case  O(n)
                //time complexity  avg case  O(n^2)
                 //time complexity  worst case  O(n^2)