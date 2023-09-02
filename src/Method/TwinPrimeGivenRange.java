package Method;
import java.util.Scanner;
public class TwinPrimeGivenRange {
	      void twinPrime(int n1,int n2) {
    	  int m,n,count=0;
    	  for(int i=n1;i<=n2;i++)
    	  {
    		  int c1=0,c2=0,a;
    		  m=i;
    		  n=i+2;
    		  for(int j=1;j<=m;j++)
    		  {
    			  if(m%j==0)
    			  {
    				  c1++;
    			  }
    		  }
    		  for(int k=1;k<=n;k++)
    		  {
    			  if(n%k==0)
    			  {
    				  c2++;
    			  }
    		  }
    		    a=Math.abs(m-n);
    		  if(c1==2 && c2==2 && a==2)
    		  {
    			  count++;
    			  System.out.println(m+","+n+  " are Twin Prime No");
    		  }
    	  }
    	          System.out.println("Twin Prime No Present in that range is="+count);
      }
      public static void main(String args[]) {
    	  Scanner sc=new Scanner(System.in);
    	  System.out.println("Enter the Range");
    	  int n1=sc.nextInt();
    	  int n2=sc.nextInt();  
       	  TwinPrimeGivenRange obj=new TwinPrimeGivenRange();
    	  obj.twinPrime(n1,n2);
   }
}
