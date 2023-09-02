package Pattern;

public class NumberPattern9 {
	public static void main(String args[]) {
    	int n=5;int x=1;
    	for(int i=1;i<=n;i++)
    	{
    		for(int j=1;j<=n;j++)
    		{
    			if(i==j)
    			{
    				System.out.print(x++ +" ");
    			}else
    			{
    				System.out.print("0"+" ");
    			}
    		}
    		        System.out.println("");
    	}
     }
}
