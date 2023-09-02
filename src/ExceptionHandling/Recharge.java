package ExceptionHandling;
import java.util.Scanner;
public class Recharge {
     static void checkRechargeValidity(int days) {
    	 int rechargeValidity=45;
    	 if(days<=45) {
    		 System.out.println("your recharge is valid");
    	 }else {
    		 throw new RechargeValidityExpiredException("validity expired");
    	 }
     }
     public static void main(String args[]) {
    	 Scanner sc=new Scanner(System.in);
    	 System.out.println("enter validity of recharge in days");
    	 int days=sc.nextInt();
    	 checkRechargeValidity(days);
     }
}
