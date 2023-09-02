package Basic;
import java.util.Scanner;
public class BusBookingApplication {
      public static void main(String args[]) {
    	  Scanner sc=new Scanner(System.in);
    	  String location,pickup,drop,book="";
    	  int seat,payment,rate;
    	  do {
    	  System.out.println("*********Welcome to RED BUS*********");
    	  System.out.println("1.Shivneri  2.Konduskar travels  3.Ghatge patil travels  4.MSRTC Buses ");
    	  int choice=sc.nextInt();
    	  switch(choice) {
    	  case 1:
    		  System.out.println("Your choice is Shivneri");
    		  System.out.println("Please enter location where you want to go?");
    		  location=sc.next();
    		  System.out.println("Please enter your pick up point");
    		  pickup=sc.next();
    		  System.out.println("Please enter your Drop point");
    		  drop=sc.next();
    		  System.out.println("Booking is Available");
    		  System.out.println("Please book your Seat");
    		  seat=sc.nextInt();
    		  System.out.println("Your Booking is confirmed");
    		  rate=500;
    		  payment=rate*seat;
    		  System.out.println("Your payment is="+payment);
    		  System.out.println("Enjoy your journey!");
    		  break;
    	  case 2:
    		  System.out.println("Your choice is konduskar travels");
    		  System.out.println("Please enter location where you want to go?");
    		  location=sc.next();
    		  System.out.println("Please enter your pick up point");
    		  pickup=sc.next();
    		  System.out.println("Please enter your Drop point");
    		  drop=sc.next();
    		  System.out.println("Booking is Available");
    		  System.out.println("Please book your Seat");
    		  seat=sc.nextInt();
    		  System.out.println("Your Booking is confirmed");
    		  rate=700;
    		  payment=rate*seat;
    		  System.out.println("Your payment is="+payment);
    		  System.out.println("Enjoy your journey!");
    		  break;
    		  
    	  case 3:
    		  System.out.println("Your choice is GhatgePatil Travels");
    		  System.out.println("Please enter location where you want to go?");
    		  location=sc.next();
    		  System.out.println("Please enter your pick up point");
    		  pickup=sc.next();
    		  System.out.println("Please enter your Drop point");
    		  drop=sc.next();
    		  System.out.println("Booking is Available");
    		  System.out.println("Please book your Seat");
    		  seat=sc.nextInt();
    		  System.out.println("Your Booking is confirmed");
    		  rate=800;
    		  payment=rate*seat;
    		  System.out.println("Your payment is="+payment);
    		  System.out.println("Enjoy your journey!");
    		  break;
    		  
    	  case 4:
    		  System.out.println("Your choice is MSRTC Buses");
    		  System.out.println("Please enter location where you want to go?");
    		  location=sc.next();
    		  System.out.println("Please enter your pick up point");
    		  pickup=sc.next();
    		  System.out.println("Please enter your Drop point");
    		  drop=sc.next();
    		  System.out.println("Booking is Available");
    		  System.out.println("Please book your Seat");
    		  seat=sc.nextInt();
    		  System.out.println("Your Booking is confirmed");
    		  rate=400;
    		  payment=rate*seat;
    		  System.out.println("Your payment is="+payment);
    		  System.out.println("Enjoy your journey!");
    		  break;
    	  default:
    		  System.out.println("invallid option"); 
    	     }
    		  System.out.println("Do you want to book again");
    		  book=sc.next();
    		  
    	  }while(book.equalsIgnoreCase("yes"));
    	  System.out.println("Thank You! Visit Again!");
      }
}
