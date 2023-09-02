package Method;

import java.util.Scanner;

public class SunnyNoGivenRange {
	 void sunnyNo(int n1,int n2) {
     	int count=0;
     	for(int i=n1;i<=n2;i++)
     	{
     		for(int j=1;j<=i;j++)
     		{	
     	    if((j*j)-1==i)
     	       {
     	    	count++;
     	    	System.out.println(i+ " is a Sunny No ");
     	    	break;
     	       }
     		      
           
              }
         } 	
     	System.out.println("Sunny No present in that range : "+count);
}       	
     public static void main(String args[]) {
     	Scanner sc=new Scanner(System.in);
     	System.out.println("Enter the Range");
     	int n1=sc.nextInt();
     	int n2=sc.nextInt();
     	SunnyNoGivenRange obj=new SunnyNoGivenRange();
     	obj.sunnyNo(n1,n2);        	
     }
}
