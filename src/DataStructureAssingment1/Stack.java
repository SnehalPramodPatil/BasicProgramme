package DataStructureAssingment1;

import java.util.Scanner;

public class Stack extends DataStructureApp{
	Scanner sc = new Scanner(System.in);
	int n = 10;
	int stack[]=new int[n];
	int top=-1;
	
	void push() {
		if(top==(n-1)) {
			System.out.println("stack is overflow");
		}else
		{
			System.out.println("Enter data");
			int i=sc.nextInt();
			top=top+1;
			stack[top]=i;
			System.out.println("item inserted");
		}
	}
	void pop() {
		if(top==-1) {
			System.out.println("stack is underflow");
		}else {
			top=top-1;
			System.out.println("item deleted");
		}
	}
	void display() {
		if(top==-1) {
			System.out.println("Stack is empty");
		}else
		{	
		System.out.println("items are....");
		for(int i=top;i>=0;i--) {
			System.out.println(stack[i]+" ");
		}
	}
}
	void stackOperation() {
		Stack s1=new Stack();
		String choice = "";
        do {
		System.out.println("1.insert");
		System.out.println("2.delete");
		System.out.println("3.display");
		System.out.println("4.exit");
		System.out.println("Enter your choice");
		int input = sc.nextInt();
		
		switch(input) {
		case 1:
			System.out.println("you have selected insert operation");
			s1.push();
			break;
		case 2:
			System.out.println("you have selected delete operation");
			s1.pop();
			break;
		case 3:
			System.out.println("you have selected display operation");
			s1.display();
			break;
		case 4:
			System.out.println("you have selected exit operation");
			default:
				System.out.println("invalid input");
		}
		System.out.println("do you want to continue");
		choice=sc.next();
        }while(choice.equalsIgnoreCase("yes"));
        System.out.println("Thank you");
	}
}
