package Basic;
import java.util.Scanner;
public class Percentage {
       public static void main(String args[]) {
    	   Scanner sc=new Scanner(System.in);
    	   System.out.println("Enter the phy marks");
    	   int phy=sc.nextInt();
    	   System.out.println("Enter the chem marks");
    	   int chem=sc.nextInt();
    	   System.out.println("Enter the eng marks");
    	   int eng=sc.nextInt();
    	   System.out.println("Enter the maths marks");
    	   int maths=sc.nextInt();
    	   System.out.println("Enter the hindi marks");
    	   int hindi=sc.nextInt();
    	   float total,Per;
    	  // System.out.println("Calculate the total marks");
    	   total=phy+chem+eng+maths+hindi;
    	   System.out.println("Total Marks=" + total);
    	  // System.out.println("Calculate the Percentage");
    	   Per=(total)*100/500;
    	   System.out.println("Percentage=" + Per);
       }
}
 