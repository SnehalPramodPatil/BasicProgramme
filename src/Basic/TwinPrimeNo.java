package Basic;
import java.util.Scanner;
public class TwinPrimeNo {
      public static void main(String args[]) {
    	  Scanner sc=new Scanner(System.in);
    	  System.out.println("Enter 1st no");
    	  int n1=sc.nextInt();
    	  System.out.println("Enter 2nd no");
    	  int n2=sc.nextInt();
    	  int c1=0,c2=0,a;
    	  for(int i=1;i<=n1;i++)
    	  {
    		  if(n1%i==0)
    			  c1++;
    	  }
    	   
    	  for(int j=1;j<=n2;j++)
    	  {
    		  if(n2%j==0)
    			  c2++;
    	  }
    	  a=Math.abs(n1-n2);
    	  if(c1==2 && c2==2 && a==2)
    	  {
    		  System.out.println(n1+" and "+n2+ " are Twin Prime No"); 
    	  }else
    	  {
    		  System.out.println(n1+" and "+n2+ " are not Twin Prime No");
    	  }
      }
}
