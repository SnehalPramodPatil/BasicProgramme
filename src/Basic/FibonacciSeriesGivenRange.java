package Basic;
import java.util.Scanner;
public class FibonacciSeriesGivenRange {
     void fibonacciSeries(int n1,int n2) {
    	 for(int i=n1;i<=n2;i++)
    	 {
    		 int f=1,s=1,t;
    		 System.out.println(f+" ");
    		 System.out.println(s+" ");
    		 for(int j=3;j<=i;j++)
    		 {
    			 t=f+s;
    			 System.out.println(t+" ");
    			 f=s;
    			 s=t;
    		 }
    	 } 
     }
     public static void main(String args[]) {
    	 Scanner sc=new Scanner(System.in);
    	 System.out.println("Enter the Range");
    	 int n1=sc.nextInt();
    	 int n2=sc.nextInt();
    	 FibonacciSeriesGivenRange obj=new FibonacciSeriesGivenRange();
    	 obj.fibonacciSeries(n1,n2);
     }
}
