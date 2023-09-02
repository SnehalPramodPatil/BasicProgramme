package ArrayProgram;

public class SecondMaxNo {
        public static void main(String args[]) {
        	int[] a= {10,12,45,36,2,4,8,45,15,41};
        	
        	int max=a[0];
        	int secondmax=a[0];
        	
        	for(int i=0;i<a.length;i++) {
        		
        		if(max<a[i]) {
        			max=a[i];
        		}
        		else if(max!=a[i] && secondmax<a[i]) {
        			secondmax=a[i];
        		}
        	}
        	System.out.println("Maximum no: "+max);
        	System.out.println("Secondmax no: "+secondmax);
        }
}
