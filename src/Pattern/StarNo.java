package Pattern;

public class StarNo {
	public static void main(String args[]) {
 	   int n=7;
 	   for(int i=1;i<=n;i++)
 	   {
 		   for(int j=1;j<=2*i-1;j++)
 		   {
 			   if(i==j)
 			   {
 				   System.out.print(i);
 			   }else
 			   {
 				   System.out.print("*"); 
 			   }
 		   }
 		            System.out.println("");
 	   }
    }
}
