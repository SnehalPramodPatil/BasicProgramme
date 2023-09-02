package Basic;

public class LastDigitOfNumber {
     public static void main(String args[]) {
    	 int n=54224,LastDigit;
    	 LastDigit=n%10;
    	 System.out.println("Last Digit of a given number " + n + " = "+LastDigit);
    	 int count=0;
    	 while(n>0) {
    		 n=n/10;
    		 count++;
    	 }
    	 System.out.println("Number of digits:"+count);
    	 
    	 //convert int to string
    	 
    	 int n1=12458;
    	 String str=Integer.toString(n1);
    	 System.out.println("No of digits "+str.length());
    	 System.out.println("Addition= "+str+n1);
    	 for(int i=str.length()-1;i>=0;i--) {
    		 System.out.print(str.charAt(i));
       
    	 }
     }
}
