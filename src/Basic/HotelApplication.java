package Basic;
import java.util.Scanner;
public class HotelApplication {
      public static void main(String args[]) {
    	  Scanner sc=new Scanner(System.in);
    	  String order=" ";
    	  do {
    	  System.out.println("*********Welcome To TAJ HOTEL************");
    	  System.out.println("********MENU CARD*********");
    	  System.out.println("1.Tea");
    	  System.out.println("2.Starter");
    	  System.out.println("3.Meal");
    	  System.out.println("4.Dessert");
    	  System.out.println("5.Beverage");
    	  System.out.println("Please enter from above Menu card");
    	  int choice=sc.nextInt();
    	  switch(choice) {
    	  case 1:
    		  System.out.println("Your order for Tea is placed successfully");
    		  break;
    	  case 2:
    		  System.out.println("Your order for Starter is placed successfully");
    		  break;
    	  case 3:
    		  System.out.println("Your order for Meal is placed successfully");
    		  break;
    	  case 4:
    		  System.out.println("Your order for Dessert is placed successfully");
    		  break;
    	  case 5:
    		  System.out.println("Your order for Beverage is placed successfully");
    		  break; 
    		  default:
    	      System.out.println("Invalid choice, Please order from above Menu Card");
    	  }
    	      System.out.println("Do you want to order more food?");
    	      order=sc.next();
    	 }while(order.equalsIgnoreCase("Yes"));
    	  System.out.println("Thank You! Visit Again!");
      }
}
