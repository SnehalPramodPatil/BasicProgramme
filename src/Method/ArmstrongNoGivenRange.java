package Method;

import java.util.Scanner;
public class ArmstrongNoGivenRange {
        public void armstrongNo(int n1,int n2) {
        	int count=0,sum=0;
            for(int i=n1;i<=n2;i++)
            {
            	int rem,arm=0,n;
            	n=i;
            	while(n>0)
            	{
            		rem=n%10;
            		arm=arm+(rem*rem*rem);
            		n=n/10;
            	}
            	if(arm==i)
            	{
            		System.out.println(i);
            		count++;
            		sum=sum+i;
            	}
            }
            System.out.println("Total Armstrong no persent in that range is "+count);
            System.out.println("Sum of Given Armstrong No is= "+sum);
   }    	
       public static void main(String args[]) {
    	   Scanner sc=new Scanner(System.in);
    	   System.out.println("Enter the Range");
    	   int  n1=sc.nextInt();
    	   int  n2=sc.nextInt();
    	   ArmstrongNoGivenRange obj=new ArmstrongNoGivenRange();
    	   obj.armstrongNo(n1,n2);
       }	  
}
