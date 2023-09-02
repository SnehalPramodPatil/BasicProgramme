package ArrayProgram;

import java.util.Arrays;

public class MergeTwoArray {
       public static void main(String args[]) {
    	   int[] a= {5,10,20,30,15};
    	   int[] b= {2,8,13,22,25};
    	   
    	   int arr1=a.length;
    	   int arr2=b.length;
    	   int arr3=arr1+arr2;
    	   
    	   int[] c=new int[arr3];
    	   for(int i=0;i<arr1;i++) {
    		   c[i]=a[i];
    	   }
    	   
    	   for(int i=0;i<arr2;i++) {
    		   c[arr1+i]=b[i];
    	   }
    	   
    	   for(int i=0;i<arr3;i++) {
              System.out.print(c[i]+" ");
          
    	   }
    	   System.out.println();
    	   System.out.println("Sorted Array");
    	    Arrays.sort(c);
    	    for(int i=0;i<arr3;i++) {
    	    	System.out.print(c[i]+" ");
    	    }
     }
}
 