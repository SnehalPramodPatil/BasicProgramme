package DataStructureAssingment1;
import java.util.Scanner;

public class Queue extends DataStructureApp {
	Scanner sc = new Scanner(System.in);
	int n = 10;
	int que[] = new int[n];
	int front = -1;
	int rear = -1;

	void insert() {
		if (rear == n - 1) {
			System.out.println("Overflow");

		} else {
			System.out.println("Enter Data");
			int i = sc.nextInt();
			if (front == -1 && rear == -1) {
				rear=0;     //rear++
				front=0;      //front++
				que[rear] = i;
			} else {
				rear=rear+1;
				que[rear] = i;
			}
			System.out.println("item added Successfully");
		}
	}

	void delete() {
		if (front == -1 && rear == -1) {
			System.out.println("underflow");
		} else {
			front++;
		}
		System.out.println("item deleted successfully");
	}

	public void display() {
		if (front == -1 && rear == -1) {
			System.out.println("Queue is empty");
		} else {
			System.out.println("The Queue is....");
			for (int i = front; i <= rear; i++) {
				System.out.print(que[i] + " ");
			}
			System.out.println("");
		}
	}

	public void queueOperation() {
		Queue q = new Queue();
//		System.out.println("Enter size of array");
//		int n = sc.nextInt();
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
				System.out.println("you have selected insert operation");
				q.insert();
				break;
			case 2:
				System.out.println("you have selected delete operation");
				q.delete();
				break;
			case 3:
				System.out.println("you have selected display operation");
				q.display();
				break;
			case 4:
				System.out.println("you have selected Exit operation");
				break;
			default:
				System.out.println("invalid input");
			}
			System.out.println("do you want to continue?");
			choice = sc.next();
		} while (choice.equalsIgnoreCase("yes"));
		System.out.println("Thank you");
	}
}
