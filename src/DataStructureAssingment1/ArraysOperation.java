package DataStructureAssingment1;

import java.util.ArrayList;
import java.util.Scanner;

public class ArraysOperation extends DataStructureApp {

	public static void arraysOperation() {

		Scanner sc = new Scanner(System.in);
		String input = "";
		do {
			
			System.out.println("******** 1. Array List operation *********");
			System.out.println("1.  Insert");
			System.out.println("2.  Delete");
			System.out.println("3.  Exit");
			System.out.println("Please enter your choice");
			int choice = sc.nextInt();
			ArrayList<Integer> mynumber = new ArrayList<Integer>();
			mynumber.add(33);
			mynumber.add(45);
			mynumber.add(10);
			mynumber.add(15);
			mynumber.add(5);
			System.out.println(mynumber);
			
			switch (choice) {
			case 1:
				System.out.println("you have selected insert operation");
				System.out.println("Enter an Element to insert: ");
				mynumber.add(sc.nextInt());
				System.out.println(mynumber);
				System.out.println("Element added successfully");
				break;
			case 2:

				System.out.println("Enter an element to delete ");
				int delete = sc.nextInt();
				if (mynumber.contains(delete)) {
					mynumber.remove(Integer.valueOf(delete));
					System.out.println(mynumber);
					System.out.println("Element removed successfully");
				} else {
					System.out.println("Element not found");
				}
				break;
			case 3:
				System.out.println("Thank you");
				break;
			default:
				System.out.println("Invalid Choice");
			}
			System.out.println("Do you want to continue?");
			input = sc.next();
		} while (input.equalsIgnoreCase("yes"));
		System.out.println("Thank you!");
	}

}