package Pattern;

public class StarNo2 {
	public static void main(String args[]) {
		//int num=1;
         for(int i=1;i<=7;i++)
         {
        	 int num=1;
        	 for(int j=1;j<=2*i-1;j++)
        	 {
        		 if(j%2==0)
        		 {
        			 System.out.print("*");
        		 }else
        		 {
        			 System.out.print(num++);
        		 }
        	 }
        	 System.out.println("");
         }
	}      
}
