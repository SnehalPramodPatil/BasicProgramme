package Basic;
import java.util.Scanner;
public class BikeModel {
         public static void main(String args[]) {
        	 Scanner sc=new Scanner(System.in);
        	System.out.println("**********Bike Models************"); 
        	System.out.println("1. Unicorn   2.Shine  3.Activa  4.Jupiter"); 
        	System.out.println("Select your choice 1-4");
        	int choice=sc.nextInt();
        	
        	switch(choice) {
        	case 1:
        		System.out.println("your choice is Unicorn");
        		System.out.println("Unicorn Model No-425145"); 
        		System.out.println("162cc ,50kmpl ,colour-black"); 
        		break;
        	case 2:
        		System.out.println("your choice is Shine");
        		System.out.println("Shine Model No-52145"); 
        		System.out.println("125cc ,50-65kmpl ,colour-grey"); 
        		break;
        	case 3:
        		System.out.println("your choice is Activa");
        		System.out.println("Activa Model No-2314545g"); 
        		System.out.println("109cc ,50-65kmpl ,colour-Matt white"); 
        		break;
        	case 4:
        		System.out.println("your choice is Jupiter");
        		System.out.println("Jupiter Model No-457845"); 
        		System.out.println("110cc ,50-62kmpl ,colour-red"); 
        		break;
        	    default:
       		    System.out.println("Invalid Choice"); 
        	}
        	
        	
   }     
}
