package Method;

public class Factorial {
	public void findFactorial(int n) {
  	  int fact=1;
  	  for(int i=1;i<=n;i++)
  	  {
  		  fact=fact*i;
  	  }
  		  System.out.println("Factorial of "+n+"="+fact);
    }
    public static void main(String args[]) {
  	  Factorial obj=new Factorial();
  	   obj.findFactorial(5);
  	 
    }
}
