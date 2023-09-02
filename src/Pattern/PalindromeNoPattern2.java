package Pattern;

public class PalindromeNoPattern2 {
	public static void main(String args[]) {
   	 int n=5;
   	/// for(int i=0;i<=n;i++)
   		 for(int i=n;i>=0;i--)
   	 {
   		 for(int j=1;j<=n-i;j++) 
   		 {
   			 System.out.print(" ");
   		 }
   		 for(int j=i;j>=0;j--)
   		 {
   			// System.out.print(j);
   			 System.out.print((char)(j+64));
   		 }
   		 //for(int j=1;j<=i;j++)
   			 for(int j=1;j<=i;j++)
   		 {
   			 //System.out.print(j);
   			 System.out.print((char)(j+64));
   		 }
   		     System.out.println("");
   	 }
   }
}
