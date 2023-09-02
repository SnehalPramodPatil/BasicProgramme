package Method;

import java.util.Scanner;
public class SunnyNo {
	 public void findSunnyNo(int n) {
	    	for(int i=1;i<=n;i++)
	    	 {
	    		 if((i*i)-1==n)
	   		     {
	    			 System.out.println(n+ " is a Sunny no"); 
	    			 break;
	   		     }
	    		 
	    		 if((i*i)-1>n)
	   		     {
	        		 System.out.println(n+" "+"is not a Sunny No");
	        		 break;
	       		 }
	    	 }	 
	    }
	     public static void main(String args[]) {
	    	 Scanner sc=new Scanner(System.in);
	    	 int n=sc.nextInt();
	    	 SunnyNo obj=new SunnyNo();
	    	 obj.findSunnyNo(n);
	     }
}
