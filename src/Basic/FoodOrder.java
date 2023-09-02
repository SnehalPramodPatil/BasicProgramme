package Basic;
import java.util.Scanner;
public class FoodOrder {
      public static void main(String args[]) {
    	  Scanner sc=new Scanner(System.in);
    	  String order="" ;
    	 //
    	  int Payment=1,Quantity=1,rate;
    	  do {
    	  System.out.println("Menu Card");
    	  System.out.println("1.Tea    Rs.10");
    	  System.out.println("2.coffee  Rs.15");
    	  System.out.println("3.vadapav  Rs.20");
    	  System.out.println("4.Cancle order");
    	  
    	  System.out.println("Enter your choice(1-4)");
    	 int choice=sc.nextInt();
    	 
    	 switch(choice) {
    	 case 1:
    		 System.out.println("you have selected Tea");
    		 System.out.println("Enter Quantity");
    		 Quantity=sc.nextInt();
    		 rate=10;
    		 Payment=rate*Quantity;
    		 System.out.println("Your Payment is "+Payment);
    		 break;
    	 case 2:
    		 System.out.println("you have selected Coffee");
    		 System.out.println("Enter Quantity");
    		 Quantity=sc.nextInt();
    		 rate=15;
    		 Payment=rate*Quantity;
    		 System.out.println("Your Payment is "+Payment);
    		 break;
    	 case 3:
    		 System.out.println("you have selected Vadapav");
    		 System.out.println("Enter Quantity");
    		 Quantity=sc.nextInt();
    		 rate=20;
    		 Payment=rate*Quantity;
    		 System.out.println("Your Payment is "+Payment);
    		 break;
    	 default:
    		 System.out.println("Cancle Order");
    	 }
    	        System.out.println("Do you want to order again");
    	        order=sc.next();
    	
    	} while(order.equalsIgnoreCase("Yes"));
    	        System.out.println("Thank You! Visit Again!");
      }
}
