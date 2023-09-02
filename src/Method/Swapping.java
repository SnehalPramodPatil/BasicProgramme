package Method;
import java.util.Scanner;
public class Swapping {
        void swap(int a,int b) {
			int c;
			System.out.println("No before Swapping");
			System.out.println("a=" + a);
			System.out.println("b=" + b);
			c = a;
			a = b;
			b = c;
			//without using third variable
//			a=a+b;
//			b=a-b;
//			a=a-b;

			System.out.println("No after Swapping");
			System.out.println("a=" + a);
			System.out.println("b=" + b);
      }
        public static void main(String args[]) {
        	Scanner sc=new Scanner(System.in);
        	int a=sc.nextInt();
        	int b=sc.nextInt();
        	Swapping obj=new Swapping();
        	obj.swap(a, b);       
    }
}
