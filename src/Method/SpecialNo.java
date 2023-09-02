package Method;
import java.util.Scanner;
public class SpecialNo {
       void special(int n) {
    	   int digit,sum=0,t=n;
    	   while(t>0)
    	   {
    		  digit= t%10;
    		  int fact=1;
    		  for(int i=1;i<=digit;i++)
    		  {
    			  fact=fact*i;
    		  }
    		  sum=sum+fact;
    		  t=t/10;
    	   }
    	   if(sum==n)
    	   {
    		   System.out.println(n+" is a Special No");
    	   }else
    	   {
    		   System.out.println(n+" is not a Special No"); 
    	   }
       }
       public static void main(String args[]) {
    	   Scanner sc=new Scanner(System.in);
    	   System.out.println("Enter a No");
    	   int n=sc.nextInt();
    	   SpecialNo s=new SpecialNo();
    	   s.special(n);
       }
}
