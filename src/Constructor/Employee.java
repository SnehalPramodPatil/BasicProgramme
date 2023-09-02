package Constructor;

public class Employee {
     String empname;
     String empdept;
     int empid;
     static String companyname="GreenSpan";
     
     public Employee(int empid,String empname,String empdept) {
    	 this.empid=empid;
    	 this.empname=empname;
    	 this.empdept=empdept;;
    }
     
     public void display() {
    	 System.out.println("EmployeeName:"+empname+" "+"EmployeeDept:"+empdept+" "+"EmployeeID: "+empid+" "+"Companyname:"+companyname);
     }
     
     public static void main(String args[]) {
    	 Employee e1=new Employee(555,"Pramod","Purchase");
    	 e1.display();
    	 Employee e2=new Employee(55,"Piyush","Project");
    	 e2.display();
    }
}
