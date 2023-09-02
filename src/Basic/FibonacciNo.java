package Basic;
import java.util.Scanner;
public class FibonacciNo {
       public static void main(String args[]) {
    	   Scanner sc=new Scanner(System.in);
    	   System.out.println("Enter No");
    	   int n=sc.nextInt();
    	   int f=0,s=1,t;
    	   System.out.println(f);
    	   System.out.println(s);
    	   for(int i=3;i<=n;i++)
    	   {
    		  t=f+s;
    		  System.out.println(t);
    	        
    	        f=s;
    	        s=t;
    	   }
    	   
       }
}
