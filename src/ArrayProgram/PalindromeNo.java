package ArrayProgram;

public class PalindromeNo {
      public static void main(String args[]) {
    	  int a[]= {121, 12,5,56,11,55,23,62};
    	  int b[]=new int[a.length];
    	  int  rem,rev=0,j=0;
    	  int n;
    	 
    	  int temp;
    	 
    	  for(int i=0;i<a.length;i++) {
    		  n=a[i];
    	      temp=n;
    	     while(n>0) { 
    		  rem=n%10;
    		  rev=rev*10+rem;
    		  n=n/10;
    	      
    	  }
    	  if(temp==rev) {
    		  b[j]=a[i];
    		  i++;
    		  
    		  System.out.println("Palindrom no are: "+b[j]);
    	  }
    	  
      }
   }
}
