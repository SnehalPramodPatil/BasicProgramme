package Basic;
import java.util.Scanner;
public class AtmMachineApplication {
     public static void main(String args[]) {
    	 Scanner sc=new Scanner(System.in);
    	 int Withdraw=0,Deposit=0,Balance=2000,MiniStatement,pin=4936;
    	 String input=" ";
    	 int userpin=pin;
    	 do {
    	 System.out.println("Welcome to SBI ATM ");
    	 System.out.println("Press 1 for withdraw");
    	 System.out.println("press 2 for Deposit");
    	 System.out.println("press 3 for Balance Enquiry");
    	 System.out.println("press 4 for View Mini Statement");
    	// System.out.println("Enter Your Pin");
    	 //pin=sc.nextInt();
    	 int choice=sc.nextInt();
    	 switch(choice) {
    	 case 1:
    		 System.out.println("you have selected Withdraw option");
    		 System.out.println("Enter Your Pin");
    		 pin=sc.nextInt();
    		 if(userpin==pin) 
    		 {
    	     System.out.println("Your pin is correct");
    		 System.out.println("Enter money to be Withdrawn");
    		 Withdraw=sc.nextInt();
    		
    		 if(Balance>=Withdraw)
    		 {
    		 Balance=Balance-Withdraw;
    		 System.out.println("Please collect your Cash");
    		 }else
    		 {
    		 System.out.println("Insuffient Balance");
    		 }
    		 }
    	 
    		 else
    		 {
    			 System.out.println("Your pin is Wrong please try again"); 
    		 }
    		 
    		 break;
    	  case 2:
    		 System.out.println("you have selected Deposit option");
    		 System.out.println("Enter Your Pin");
    		 pin=sc.nextInt();
    		 if(userpin==pin)
    		 {
    			
    		 System.out.println("Your pin is correct");
    		 System.out.println("Enter money to be deposited");
    		 Deposit=sc.nextInt();
    		 Balance=Balance+Deposit;
    		 System.out.println("your money has been successfully deposited");
    		 }else {
    	     System.out.println("Your pin is Wrong please try again");
    		 }
    		 break;
    	  case 3:
     		 System.out.println("you have selected Balance Enquiry option");
     		 System.out.println("Enter Your Pin");
    		 pin=sc.nextInt();
    		 if(userpin==pin) {
    		 System.out.println("Your pin is correct"); 
     		 System.out.println("Balance="+Balance);
    		 }else
    		 {
    		 System.out.println("Your pin is Wrong please try again");
    		 }
     		 break;
    	 case 4:
    		 System.out.println("you have selected View Mini Statement option");
    		 System.out.println("Enter Your Pin");
    		 pin=sc.nextInt();
    		 if(userpin==pin) {
    		 System.out.println("Your pin is correct");  
    		 System.out.println("Here is your Mini Statement");
    		 }else
    		 {
    	     System.out.println("Your pin is Wrong please try again");
    		 }
    		 break;
    		 
    		 default:
    		 System.out.println("Invalid Option"); 
    	 }
    	     System.out.println("Do you want to do Transaction again");
    	     input=sc.next();
    	 }while(input.equalsIgnoreCase("yes"));
    	 System.out.println("Thank You! Visit Again!");
     }
}
