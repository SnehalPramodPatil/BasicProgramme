package Pattern;

public class Alphabet {
	 public static void main(String args[]) {
     	int n=7,alpha=64;
     	//upper half
     	for(int i=n;i>=1;i--)
     	{
     		for(int j=1;j<=n-i;j++)
     		{
     			System.out.print(" ");
     		}
     		for(int j=i;j>=1;j--)
     		{
     			System.out.print((char)(j+alpha));
     		}
     		for(int j=2;j<=i;j++)
     		{
     			System.out.print((char)(j+alpha));
     		}
     		 System.out.println("");
     	}            //lower half
     	for(int i=1;i<=n;i++)
     	{
     		for(int j=1;j<=n-i;j++)
     		{
     			System.out.print(" ");
     		}
     		for(int j=i;j>=1;j--)
     		{
     			System.out.print(j);
     		}
     		for(int j=2;j<=i;j++)
     		{
     			System.out.print(j);
     		}
     		 System.out.println("");
     	}
     	
     	
     }
}


