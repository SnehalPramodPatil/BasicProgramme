package ArrayMethod;

import java.util.Scanner;
public class EvenOdd {
      public static void printEvenNo(int arr[],int n) {
    	  for(int i=0;i<n;i++) {
    		  if(arr[i]%2==0) {
    			  System.out.println(arr[i]+" ");
    		  }
    	  }
      }
      
      public static void printOddNo(int arr[],int n) {
    	  for(int i=0;i<n;i++) {
    		  if(arr[i]%2!=0) {
    			  System.out.println(arr[i]+" ");
    		  }
    	  }
      }
      
      public static void main(String args[]) {
    	  Scanner sc=new Scanner(System.in);
    	  System.out.println("Enter array size ");
    	  int n=sc.nextInt();
    	  int[] arr=new int[n];
    	  System.out.println("Enter array elements");
    	  for(int i=0;i<arr.length;i++) {
    		  arr[i]=sc.nextInt();
    	  }
    	 // EvenOdd e1=new EvenOdd();
    	  System.out.println("Even elements");
    	  printEvenNo(arr,n);  // e1.printEvenNo(arr, n);
    	  System.out.println("Odd elements");
    	  printOddNo(arr,n);   // e1.printOddNo(arr, n);
      }
}
