package Basic;
import java.util.Scanner;
public class MetroCity1 {
      public static void main(String args[]) {
    	 Scanner sc=new Scanner(System.in);
    	 String check=" ";
    	 do {
    	 System.out.println("Enter a City Name to check Metro city or not");
    	 String Cityname=sc.next();
    	    Cityname=Cityname.toLowerCase();
    	 
    	 switch(Cityname) {
    	 case "mumbai":
    		 System.out.println(Cityname+" " +"is a Metro City");
    		 break;
    	 case "pune":
    		 System.out.println(Cityname+" "+"is a Metro City");
    		 break;
    	 case "nagpur":
    		 System.out.println(Cityname+" "+"is a Metro City");
    		 break;
    	 case "nashik":
    		 System.out.println(Cityname+" "+"is a Metro City");
    		 break;
    	 default:
    		 System.out.println(Cityname+" "+"is a non Metro City");
    			 
    	 }
    	 System.out.println("Do you want to check again?");
    	 check=sc.next();
      }
    	 while(check.equalsIgnoreCase("Yes"));
    	 System.out.println("Thank You! Visit Again!");
    } 	 
}
