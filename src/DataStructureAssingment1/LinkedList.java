package DataStructureAssingment1;

import java.util.Scanner;

public class LinkedList extends DataStructureApp {
	Scanner sc = new Scanner(System.in);

	static class Node {
		int data;
		Node next;

		Node(int data) {
			this.data = data;
			this.next = null;
		}
	}

	Node head = null;

	public void insert() {
		int data, n;
		
			System.out.println("Enter data to insert");
			data = sc.nextInt();
			Node newnode = new Node(data);
			if (head == null) {
				head = newnode;
			} else {
				newnode.next = head;
				head = newnode;
			}
			System.out.println("item added successfully");
	}
	public void delete() {
		Node temp=head;
		temp=temp.next;
		head=temp;
		System.out.println("item deleted successfully");
	}

	public void display() {
		System.out.println("items are: ");
		Node temp = head;
		if (head == null) {
			System.out.println("link list does not exit");
		} else {
			while (temp != null) {
				System.out.println(temp.data+" ");
				temp = temp.next;
			}
		}
	}

	public void linkListOperation() {
		LinkedList l1 = new LinkedList();
		String choice = "";
		do {
			System.out.println("1.insert");
			System.out.println("2.delete");
			System.out.println("3.display");
			System.out.println("4.exit");
			System.out.println("Enter your choice");
			int input = sc.nextInt();

			switch (input) {
			case 1:
				System.out.println("1.insert");
				l1.insert();
				break;
			case 2:
				System.out.println("2.delete");
                 l1.delete();
				break;
			case 3:
				System.out.println("3.display");
				l1.display();
				break;
			case 4:
				System.out.println("4.exit");
				break;
			default:
				System.out.println("invalid input");
			}
			System.out.println("do you want to continue?");
			choice = sc.next();
		} while (choice.equalsIgnoreCase("yes"));
		System.out.println("Thank you!");

	}
}
