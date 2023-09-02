package Pattern;

public class PalindromeNoPattern1 {
	 public static void main(String args[]) {
    	 int n=9;
    	  for(int i=9;i>=1;i--)
    	// for(int i=1;i<=9;i++) 
    	 {
    		 for(int j=1;j<=i-1;j++)
    		 {
    			 System.out.print(" ");
    		 }
    		 for(int j=i;j<=9;j++)	
    		 {
    			System.out.print(j+"");
    		 }
    		 for(int j=8;j>=i;j--)
    		 {
    			 System.out.print(j);
    		 }
    		 System.out.println("");
    	 }
     }
}
