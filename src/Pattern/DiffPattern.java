package Pattern;

public class DiffPattern {
	public static void main(String args[]) {
  	  int n=9; int mid=n/2+1;
  	  for(int i=1;i<=n;i++) 
  	  {
  		  for(int j=1;j<=n;j++)
  		  {
  			// if(i==n || j==1 || i==j) 
  		       //if(i==1 || j==n || i==j)
  				// if(i==1 || j==1 || i+j==n+1)
  				   if(i==n || j==n || i+j==n+1)
  				    //if(i==n || i==1 || i==j || i+j==n+1) 
  				    	 //if(j==n || j==1 || i==j || i+j==n+1) 
  				    		// if(j==n || j==1 || i==n || i==1 || i==j || i+j==n+1) 
  				    			 //if(j==mid || i==mid || i==j || i+j==n+1) 
  				    				//if(j==mid || i==mid || j==1 && i<=mid || j==n && i>=mid || i==1 && j>=mid || i==n && j<=mid)
  			                  // if(i==n || j==mid || i+j==mid && j<=mid) 
  				    					 //if(i==n || i==1 || i==mid ||  j==1 &&  i>=mid || j==n && i<=mid) 
  				    						// if(i==n || i==1 || j==n ||  i==mid) 
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
