package ArrayProgram;
import java.util.Scanner;
public class Average {
       public static void main(String args[]) {
    	   Scanner sc=new Scanner(System.in);
    	   int sum=0; double avg;
    	   System.out.println("Enter the size of array");
    	   int n=sc.nextInt();
    	   int[] a=new int[n];
    	   System.out.println("Enter array elements");
    	   for(int i=0;i<a.length;i++) {
    		   a[i]=sc.nextInt();
    		   sum=sum+a[i];
    	   }
    	   System.out.println("sum of array elements is: "+sum);
    	   avg=sum/n;
    	   System.out.println("Average: "+avg);
       }
}
