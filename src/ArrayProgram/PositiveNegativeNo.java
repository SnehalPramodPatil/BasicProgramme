package ArrayProgram;

public class PositiveNegativeNo {
        public static void main(String args[]) {
        	int[] a= {2,5,-8,10,-45,55,-78};
        	int count1=0,count2=0;
        	System.out.println("Positive nos:");
        	for(int i=0;i<a.length;i++) {
        		if(a[i]>0) {
        			count1++;
        			System.out.println(a[i]);
        		}
        	}
        	System.out.println("positive no count is "+count1);
        	
        	System.out.println("Negative nos:");
        	for(int i=0;i<a.length;i++) {
        		if(a[i]<0) {
        			count2++;
        			System.out.println(a[i]);
        		}
        	}
        	System.out.print("negative no count is "+count2);
        }
}
