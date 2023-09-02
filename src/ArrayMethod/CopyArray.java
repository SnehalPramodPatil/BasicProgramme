package ArrayMethod;
import java.util.Scanner;
public class CopyArray {
        public static void copyingArray(int a[],int n,int b[]) {
        	for(int i=0;i<n;i++) {
        		b[i]=a[i];
        		 System.out.print(b[i]+" ");
        	}
        }

 public static void main(String args[]) {
	     Scanner sc=new Scanner(System.in);
	     System.out.println("Enter size of Array");
	     int n=sc.nextInt();
	     int a[]=new int[n];
	     int b[]=new int[n];
	     System.out.println("Enter Elements of orignal array");
	     for(int i=0;i<a.length;i++) {
	      a[i]=sc.nextInt();
	     }
	     System.out.println("Elements of copying array");
	     copyingArray(a,n,b);
     }
     
}   