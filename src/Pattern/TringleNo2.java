package Pattern;

public class TringleNo2 {
	public static void main(String args[]) {
   	 int n=5;
   	for(int i=n;i>=1;i--)
   		// for(int i=1;i<=n;i++)
   	 {
   		 for(int j=n;j>=i;j--)
   		 {
   			// System.out.print((char)(j+64));
   			   System.out.print(j);
   		 }
   		 System.out.println("");
   	 }
   }
}
