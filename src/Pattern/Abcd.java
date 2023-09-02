package Pattern;

public class Abcd {
	public static void main(String args[]) {
        int n=5;
        int alpha=65;
	  for(int i=1;i<=n;i++)
	  {
		  for(int j=n;j>=i;j--) 
		  {
			 System.out.print((char)(alpha+j)); 
		  }
		  System.out.println(""); 
	  }
   }
}
