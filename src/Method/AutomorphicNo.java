package Method;
import java.util.Scanner;
public class AutomorphicNo {
       void automorphic(int n)
        {
        	int sq=n*n;
        	int l=(""+n).length();
        	int digit=sq% (int)Math.pow(10, l);
        
        if(digit==n)
        {
        	System.out.println(n+" is a Automorphic No");
        }else
        {
        	System.out.println(n+" is a not Automorphic No");
        }
   }
        public static void main(String args[]) {
        	Scanner sc=new Scanner(System.in);
        	System.out.println("Enter a No");
        	int n=sc.nextInt();
        	AutomorphicNo a=new AutomorphicNo();
        	a.automorphic(n);        	
        }
}