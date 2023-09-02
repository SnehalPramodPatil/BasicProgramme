package Basic;
import java.util.Scanner;
public class PrimeNoGivenRange {
       public static void main(String args[]) {
    	   Scanner sc=new Scanner(System.in);
    	   int totalcount=0,sum=0;
    	   System.out.println("Enter the range");
    	   int n1=sc.nextInt();
    	   int n2=sc.nextInt();
    	   for(int i=n1;i<=n2;i++)
    	   {
    		   int count=0;
    		   for(int j=1;j<=i;j++)
    		   {
    			   if(i%j==0)
    				   count++;
    		   }
    		   if(count==2)
    		   {
    			   System.out.println(i);
    			  totalcount++;
    			  sum=sum+i;

    		   }
    	   }
    	   
    	   System.out.println("Total  prime no present in that range is "+totalcount);
    	   System.out.println("Sum of given prime no is="+sum);
       }
}
