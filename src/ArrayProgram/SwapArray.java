package ArrayProgram;
import java.util.Scanner;
public class SwapArray {
      public static void main(String args[]) {
    	Scanner sc=new Scanner(System.in);
    	System.out.println("Enter size of array");
    	int size=sc.nextInt();
    	int a[]=new int[size];
    	int b[]=new int[size];
    	
    	System.out.println("Enter elements of first array");
    	for(int i=0;i<a.length;i++) {
    		a[i]=sc.nextInt();
    	}
    	
    	System.out.println("Enter elements of second array");
    	for(int i=0;i<a.length;i++) {
    		b[i]=sc.nextInt();
    	}
    	
    	for(int i=0;i<size;i++) {
    		a[i]=a[i]+b[i];
    		b[i]=a[i]-b[i];
    		a[i]=a[i]-b[i];
    	}
    	System.out.println("first array elements after Swapping");
    	printArray(a,size);
    	System.out.println("");
    	System.out.println("Second array elements after Swapping");
    	printArray(b,size);
      }
      
      public static void printArray(int[] array,int size) {
    	  for(int number:array) {
    		  System.out.print(number+" ");
    	  }
      }
}
