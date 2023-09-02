package Method;

import java.util.Scanner;

public class PrimeNo {
	public void checkPrime(int n) {
    	int count=0;
    	for(int i=1;i<=n;i++)
    	{
    		if(n%i==0)
    			count++;
    	}
    	if(count==2)
    	{
    		System.out.println(n+" "+"is a Prime no");
    	}else
    	{
    		System.out.println(n+" "+"is a not Prime no");
    	}
    }

    public static void main(String args[]) {
    	Scanner sc=new Scanner(System.in);
    	int n=sc.nextInt();
    	PrimeNo p1=new PrimeNo();
    	p1.checkPrime(n);
    }
}
