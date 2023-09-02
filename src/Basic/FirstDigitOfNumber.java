package Basic;

public class FirstDigitOfNumber {
        public static void main(String args[]) {
        	int n=457,firstDigit;
        	firstDigit=n;
        	while(firstDigit>=10) 
         	{
        	firstDigit=firstDigit/10;
        	}
        	System.out.println("First Digit of a givin number " + n + " = " +firstDigit);
        }
}
