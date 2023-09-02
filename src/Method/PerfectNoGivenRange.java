package Method;

import java.util.Scanner;
public class PerfectNoGivenRange {
	   int count=0,sum1=0;
       void perfectNo(int n1,int n2) {
    	   for(int i=n1;i<=n2;i++)
    	   {
    		   int sum=0;
    		   for(int j=1;j<i;j++)
    		   {
    			   if(i%j==0)
    			   {
    				  sum=sum+j; 
    			   }
    		   }
    		   if(sum==i)
    		   {
    			   count++;
    			   sum1=sum1+i;
    			   System.out.println(i);
    		   }
    	   }
    	   System.out.println("Perfect No present in that range is="+count);
    	   System.out.println("Sum of given Perfect no is= "+ sum1);
       }
       public static void main(String args[]) {
    	   Scanner sc=new Scanner(System.in);
    	   System.out.println("Enter the range ");
    	   int n1=sc.nextInt();
    	   int n2=sc.nextInt();
    	   System.out.println("Perfect no in the given range are");
    	   PerfectNoGivenRange obj=new PerfectNoGivenRange();
    	   obj.perfectNo(n1, n2);
       }
}
