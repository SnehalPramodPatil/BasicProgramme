package Method;
import java.util.Scanner;
public class PalindromicPrime {
         void checkPalindromicPrime(int n) {
        	 int count=0,p=n,rem,rev=0;
        	 for(int i=1;i<=n;i++)
        	 {
        		 if(n%i==0)
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
        	 if(rev==n && count==2)
        	 {
        		 System.out.println(n+" is a Palindromic Prime No");
        	 }else
        	 {
        		 System.out.println(n+" is not a Palindromic Prime No");
        	 }
      }
         public static void main(String args[]) {
        	 Scanner sc=new Scanner(System.in);
        	 System.out.println("Enter Number");
        	 int n=sc.nextInt();
        	 PalindromicPrime p1=new PalindromicPrime();
        	 p1.checkPalindromicPrime(n);
         }
}
