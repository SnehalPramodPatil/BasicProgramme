package Basic;
import java.util.Scanner;
public class PalPrimeNo {
      public static void main(String args[]) {
    	  Scanner sc=new Scanner(System.in);
    	  int count=0,rem=0,rev=0;
    	  int n=sc.nextInt();
    	  int p=n;
    	  for(int i=1;i<=p;i++)
    	  {
    		  if(p%i==0)
    		  {
    			 count++; 
    		  }
    	  }
    	  while(p>0)
    	  {
    		  rem=p%10;
    		  rev=rev*10+rem;
    		  p=p/10;
    	  }
    	  if(count==2 && rev==n)
    	  {
    		  System.out.println(n+" is Palprime No ");
    	  }else
    	  {
    		  System.out.println(n+ " is not palprime No");
    	  }
      }
}
