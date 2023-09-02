package Bank;

public class Demo {
   public static void main(String args[]) {
	   BankDetails b1=new BankDetails("Soham","SBIN001545");
	   System.out.println("Employee Name: "+b1.name+" "+"IFSC NO: "+b1.ifsc);
	   b1.setaccountNo(3254687);
	   System.out.println("Account No:"+b1.getaccountNo()+" "+"Bank Name= "+b1.bankName);
	   Person b2=new Person();
	   b2.displayBrachName();
	   System.out.println("Employee Id: "+b2.getemployeeId());
   }
}
