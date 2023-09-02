package Method;

import java.util.Scanner;
public class PrimeNoGivenRange {
	public void primeNo(int n1,int n2) {
    	 int totalcount=0;
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
    		 }
    	 }
    	 System.out.println("Total Prime no present in that range is "+totalcount);
     }
     public static void main(String args[]) {
    	 Scanner sc=new Scanner(System.in);
    	 System.out.println("Enter Range");
    	 int n1=sc.nextInt();
    	 int n2=sc.nextInt();
    	 
    	 PrimeNoGivenRange p1=new PrimeNoGivenRange();
    	 p1.primeNo(n1, n2);
     }
}
