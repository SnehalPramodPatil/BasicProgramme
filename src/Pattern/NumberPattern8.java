package Pattern;

public class NumberPattern8 {
	public static void main(String args[]) {
  	  int n=5;
  	  for(int i=5;i>=1;i--)
  	  {
  		  for(int j=i;j<=5;j++)
  		  {
  			  System.out.print(j);
  		  }
  		  for(int j=i-1;j>=1;j--) 
  		  {
  			  System.out.print("5");
  		  }
  		  System.out.println("");
  	  }
    }
}
