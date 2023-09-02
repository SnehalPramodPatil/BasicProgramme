package Method;

public class FibonacciNoSeries {
	 public void fibonacciNo(int n) {
    	 int f=1,s=1,t,sum=2;
    	 System.out.println(f+" ");
    	 System.out.println(s+" ");
    	 for(int i=3;i<=n;i++) 
    	 {
    	 t=f+s;
    	 System.out.println(t+" ");
    	 f=s;
    	 s=t;
    	 sum=t+sum;
    	 }
    	 System.out.println("sum of fibonacci series="+sum);
     }
     public static void main(String args[]) {
    	 FibonacciNoSeries obj=new FibonacciNoSeries();
    	 obj.fibonacciNo(7);
     }
}
