package User;
import java.util.Arrays;
import java.util.Scanner;
import java.util.ArrayList;
public class LinearDataStructureApp {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String input = "";
		
		do {
			System.out.println("*******Linear Data Structure Application*********");
			System.out.println("1. Array operation");
			System.out.println("2. stack operation");
			System.out.println("3. Linked List operation");
			System.out.println("4. Queue operation");
			System.out.println("5. Exit");
			System.out.println("Enter your choice");
			int choice = sc.nextInt();

			switch (choice) {
			case 1:
				System.out.println("you have selected Array opeartion");
				ArrayList<Integer> mynumber=new ArrayList<Integer>();
				mynumber.add(33);
				mynumber.add(45);
				mynumber.add(10);
				mynumber.add(15);
				mynumber.add(5);
				System.out.println(mynumber);
			    System.out.println("Insert Element");
			     int insert=sc.nextInt();
				mynumber.add(insert);
				System.out.println(mynumber);
				System.out.println("delete Element");
				int delete=sc.nextInt();
				int removeinx=
				mynumber.remove(2);
				System.out.println(mynumber);
				break;
			case 2:
				System.out.println("you have selected stack operation");
			
				break;

			case 3:
				System.out.println("you have selected Linked list operation");
				break;

			case 4:
				System.out.println("you have selected Queue operation");
				break;

			case 5:
				System.out.println("you have selected Exit");
				break;

			default:
				System.out.println("please input valid operation");
			}
			System.out.println("Do you want to continue?");
			input = sc.next();
		} while (input.equalsIgnoreCase("Yes"));
		System.out.println("Thank you Visit again!");

	}

}
