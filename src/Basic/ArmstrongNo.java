package Basic;
import java.util.Scanner;
public class ArmstrongNo {
      public static void main(String args[]) {
    	  Scanner sc=new Scanner(System.in);
    	  System.out.println("Enter the 1st No");
    	  int n1=sc.nextInt();
    	  System.out.println("Enter the 2nd No");
    	  int n2=sc.nextInt();
    	  for(int i=n1;i<=n2;i++) 
         {
    	 int n, rem,Armstrong=0;
    	   n=i;
    	 while(n>0)
    	 {
    		 rem=n%10;
    		 Armstrong=(rem*rem*rem)+Armstrong;
    		 n=n/10;
    	 }
    	 if(i==Armstrong)
    	 {
    		 System.out.println(i+" "+"is Armstrong No");
    	 }
      }	 

  }
}
