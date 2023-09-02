package Pattern;

public class TringleNo1 {
	public static void main(String args[]) {
  	  int n=7;
  	  for(int i=7;i>=1;i--)
  	  {
  		  for(int j=1;j<=n-i;j++)
  		  {
  			 System.out.print(" ");
  		  }
  		    for(int j=i;j>=1;j--)
  		    {
  		    	System.out.print(j+"");
  		    }
  		    System.out.println("");
  	  }
  	  
  	  for(int i=2;i<=7;i++)
  	  {
  		  for(int j=1;j<=n-i;j++)
  		  {
  			 System.out.print(" ");
  		  }
  		    for(int j=i;j>=1;j--)
  		    {
  		    	System.out.print(j+"");
  		    }
  		    System.out.println("");
  	  }
    }
}
