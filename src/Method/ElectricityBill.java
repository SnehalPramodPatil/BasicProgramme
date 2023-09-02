package Method;
import java.util.Scanner;
public class ElectricityBill {
      String name;
      int unit;
      double bill;
      void accept()
      {
    	  Scanner sc=new Scanner(System.in);
    	  System.out.println("Enter the Name of customer"); 
    	  name=sc.nextLine();
    	  System.out.println("Enter the number of Units consumed"); 
    	  unit=sc.nextInt();
      }
      void calculate()
      {
    	  if(unit<100)
    		  bill=2*unit;
    	  else if(unit>100 && unit<300)
    		  bill=2*100 + (unit-100)*3;
    	  else if(unit>300)
    		  bill=2*100+3*200+(unit-300)*5;
    	      bill=bill+2.5*bill/100;
      }
      void print()
      {
    	  System.out.println("Name of the customer: "+name);
    	  System.out.println("Number of units consumed: "+unit);
    	  System.out.println("Bill Amount: "+bill); 
      }
      public static void main(String args[]) {
    	  ElectricityBill obj=new ElectricityBill();
    	  obj.accept();
    	  obj.calculate();
    	  obj.print();
      }
}
