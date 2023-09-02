package Method;

import java.util.Scanner;

public class PerfectNo {
      void checkPerfectNo(int n) {
    	int sum=0;
    	for(int i=1;i<n;i++)
    	{
    		if(n%i==0) 
    		{
    			sum=sum+i;
    		}
    	}
    	if(n==sum)
    	{
    		System.out.println(n+" "+"is a Perfect No");
    	}
    	else
    	{
    		System.out.println(n+" "+"is a not Perfect No");
    	}
    }
    public static void main(String args[]) {
    	Scanner sc=new Scanner(System.in);
    	int n=sc.nextInt();
    	PerfectNo obj=new PerfectNo();
    	obj.checkPerfectNo(n);
    }
}
