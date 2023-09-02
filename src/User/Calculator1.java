package User;
import java.util.Scanner;
import Method.Calculator;
public class Calculator1 {

	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 1st no");
	     int No1 = sc.nextInt();
		System.out.println("Enter 2nd no");
		int No2 = sc.nextInt();
		Calculator obj=new Calculator();
		obj.cal(No1,No2);	
		
//		Shape s1=new Rectangular();
//		s1.draw();
		}
}
