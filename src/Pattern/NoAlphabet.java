package Pattern;

public class NoAlphabet {
	public static void main(String args[]) {
   	 int n=7;
   
   	 for(int i=1;i<=n;i++)
   	 {
   		for(int j=1;j<=i;j++)
   		{
   			System.out.print(j);
   		}
   		for(int j=n-i;j>=1;j--) 
   		{
   			//System.out.print("*");
   			System.out.print((char)(i+64));
   		}
   		      System.out.println("");
   	 }
   }
}
