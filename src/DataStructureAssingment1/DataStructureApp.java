package DataStructureAssingment1;

import java.util.ArrayList;
import java.util.Scanner;

public class DataStructureApp {
       public static void dataStructure() {
    	   
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
				ArraysOperation a1=new ArraysOperation();
				a1.arraysOperation();
				break;
			case 2:
				System.out.println("you have selected stack operation");
                Stack s1=new Stack();
                s1.stackOperation();
				break;

			case 3:
				System.out.println("you have selected Linked list operation");
				 LinkedList l1=new LinkedList();
				  l1.linkListOperation();
				break;

			case 4:
				System.out.println("you have selected Queue operation");
				Queue q1=new Queue();
		         q1.queueOperation();
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


