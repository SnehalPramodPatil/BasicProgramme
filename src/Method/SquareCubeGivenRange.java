package Method;
import java.util.Scanner;

public class SquareCubeGivenRange {
	int n1, n2;
//
//	void accept() {
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter range ");
//		int n1 = sc.nextInt();
//		int n2 = sc.nextInt();
//	}

	void Square(int n1, int n2) {
		for (int i = n1; i <= n2; i++) {
			int sq = i * i;
			System.out.println("Square of " + i + "=" + sq);
		}
	}

	void Cube(int n1, int n2) {
		for (int i = n1; i <= n2; i++) {
			int cube = i * i * i;
			System.out.println("cube of " + i + "=" + cube);
		}
	}

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter range ");
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		SquareCubeGivenRange obj = new SquareCubeGivenRange();
		//obj.accept();
		obj.Square(n1, n2);
		obj.Cube(n1, n2);

	}
}
