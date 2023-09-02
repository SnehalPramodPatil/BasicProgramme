package ArrayProgram;

public class BubbleSort {
	public static void main(String args[]) {
		int[] a = { 2, 10, 54, 32, 69, 5, 8, 15,100,532 };
		int temp = 0;
		for (int i = 0; i < a.length; i++) {    //array traversed from 1st element to last element
                                                // and current element is compared with next element
			for (int j = 1; j < a.length; j++) {
				if (a[j - 1] > a[j])          //if current element is greater than next element then swap
				{
					// swap
					temp = a[j - 1];
					a[j - 1] = a[j];
					a[j] = temp;
				}
			}
		}
		 System.out.println("New sorted array is:");        //acending order
		 for(int i=0;i<a.length;i++) {
			 System.out.print(a[i]+" ");
		 }
	}
}
                        //time complexity best case O(n^2)       space complexity 0(1) bcoz extra variable is used for Swapping
                                         //avg case O(n^2)
                                         //worst case O(n^2)