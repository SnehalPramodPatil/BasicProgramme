package Method;
import java.util.Scanner;
public class PalindromicPrimeGivenRange {
         void palindromicPrime(int n1,int n2) {
 
        	 for(int i=n1;i<=n2;i++)
        	 {
        		 int count=0;
        		 for(int j=1;j<=i;j++)
        		 {
        			 if(i%j==0)
        			 {
        				 count++;
        			 }
        		 }
        		 int rev=0,rem;
        		 int n=i;
        		 while(n>0)
        		 {
        			 rem=n%10;
        			 rev=rev*10+rem;
        			 n=n/10;
        		 }
        		 if(count==2 && rev==i)
        		 {
        			 System.out.println(i+" is a Palindromic Prime No");
        		 }
        	 }
         }
         public static void main(String args[]) {
        	 Scanner sc=new Scanner(System.in);
        	 System.out.println("Enter the range");
        	 int n1=sc.nextInt();
        	 int n2=sc.nextInt();
        	 PalindromicPrimeGivenRange obj=new PalindromicPrimeGivenRange();
        	 obj.palindromicPrime(n1,n2);        	 
         }
}
