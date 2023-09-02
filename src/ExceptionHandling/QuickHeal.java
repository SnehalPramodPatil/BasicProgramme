package ExceptionHandling;
import java.util.Scanner;
public class QuickHeal {
     public static void validateSubcription(long key) {
    	 long validKey=12345678;
    	 if(validKey==key) {
    		 System.out.println("Scanning your system........");
    	 }else
    	 {
    		 throw new KeyExpiredException("Key is Expired");
    	 }
     }
     public static void main(String args[]) {
    	 System.out.println("Enter Activation key");
    	 Scanner sc=new Scanner(System.in);
    	 long key=sc.nextLong();
    	 validateSubcription(key);
     }
}
