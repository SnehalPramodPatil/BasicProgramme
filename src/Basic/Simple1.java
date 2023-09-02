package Basic;

public class Simple1 {
        public static void main(String args[]) {
        	for(int i=1;i<=50;i++) {
        		if((i%3==0)&&(i%5==0))
        		{
        			System.out.println("HHD");
        		}
        	    else if(i%3==0) 
        		{
        			System.out.println("SSD");
        		}
        		else if(i%5==0)
        		{
        			System.out.println("Pendrive");
        		}
        		else 
        		{
        			System.out.println(i);
        		}
        	}
        }
}
