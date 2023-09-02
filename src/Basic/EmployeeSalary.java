package Basic;
import java.util.Scanner;
public class EmployeeSalary {
      public static void main(String args[]) {
    	  Scanner sc=new Scanner(System.in);
    	 // double HRA,TA,DA,MA,PF,NetSalary,GrossPay;
    	  System.out.println("Enter Employee Name");
    	  String name=sc.nextLine();
 		  System.out.println("Enter Basic Salary"); 
    	  Double BS=sc.nextDouble();
    	  double HRA=45.0/100.0*BS;
    	  double TA=25.0/100.0*BS;
    	  double DA=30.0/100.0*BS;
    	  double MA=5.0/100.0*BS;
    	  double PF=25.0/100.0*BS;
    	  double GrossPay=BS+HRA+TA+DA;
    	  double NetSalary=GrossPay-MA-PF;
    	  System.out.println("Employee Name :"+name); 
    	  System.out.println("Gross Pay: "+GrossPay); 
    	  System.out.println("Your Net Salary :"+NetSalary); 
    	  
      }
}
