package Pattern;

public class Arrow {
	 public static void main(String args[]) {
   	  int n=7;
   	  int mid=n/2+1;
   	  for(int i=1;i<=n;i++)
   	  {
   		  for(int j=1;j<=n;j++)
   		  {
   			  if(i==mid || i+j==mid+1 || i-j==mid-1)
   				  //if(j==mid || i+j==mid+1 || j-i==mid-1)
   					 // if(i==mid || i+j==n+mid || j-i==mid-1)
   						 // if(j==mid || i+j==mid+n || i-j==mid-1)
   							  //if(i==1 || j==1 || j==i)
   								 // if(i==1 || j==n || j+i==n+1)
   									  //if(i==n || j==1 || j+i==n+1)
   										  //if(i==n || j==n || j==i)
   			  {
   				  System.out.print("*");
   			  }else
   			  {
   				  System.out.print(" ");
   			  }
   	     }
   		    System.out.println("");
   		  
   	  }
   }
}
