package ArrayProgram;

public class SelectionSort {
	public static void main(String args[]) {
		int[] a = { 10, 9, 18, 7, 0, 33, 4,25,8,7 };
		int temp = 0;
		for (int i = 0; i < a.length; i++) 
		{
  // set 1st element as minimum campare with 2nd element if 2nd element is smaller than minimum then assign the2nd element as minimum  
			for (int j = i+1; j < a.length; j++)  //after each iteration minimum is placed in front of d unsorted array
			{
				//if (a[i] > a[j])
					if (a[i] < a[j])
				{
					//swapping
					temp = a[i];
					
					a[i] = a[j];
					a[j] = temp;
				}
			}
			System.out.print(a[i]+" ");
		}
		System.out.println("");
		System.out.println("Maximum no is: "+a[0]);
		
		System.out.print("Minimum no is:"+a[a.length-1]);
	}
}
                          //time complexity best case O(n^2)     space complexity O(1) 
                          //time complexity avg case O(n^2) 
                           //time complexity worst case O(n^2) 