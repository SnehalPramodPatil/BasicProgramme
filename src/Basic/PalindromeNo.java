package Basic;

public class PalindromeNo {
      public static void main(String args[]){
    	  int n=121,reverse=0,remainder,orignalno;
    	  orignalno=n;
    	  while(n>0)
    	  {
    		  remainder=n%10;
    		  reverse=(reverse*10+remainder);
    		  n=n/10;
    	  }
    	  System.out.println(reverse);
    	  if(reverse==orignalno)
    	  {
    		  System.out.println("No is Palindrome");  
    	  }
    	  else
   	  {
    		  System.out.println("No is not Palindrome");
    	  }
    		  
    		  
      }
}
