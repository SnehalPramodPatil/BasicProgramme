package Method;

import java.util.Scanner;
public class BuzzNoGivenRange {
	void buzzNo(int n1,int n2) {
  	  int count=0,sum=0;
  	  for(int i=n1;i<=n2;i++)
  	  {
  		  if(i%10==7 || i%7==0)
  		  {
  			  count++;
  			  sum=sum+i;
  			  System.out.println(i);
  			  
  		  }
  	  }
  	  System.out.println("Buzz no present in that range is="+count);
  	  System.out.println("sum of given Buzz no is="+sum);
    }
    public static void main(String args[]) {
  	  Scanner sc=new Scanner(System.in);
  	  System.out.println("Enter the range");
  	  int n1=sc.nextInt();
  	  int n2=sc.nextInt();
  	  BuzzNoGivenRange obj=new BuzzNoGivenRange();
  	  obj.buzzNo(n1, n2);     
 }
}
