package Constructor;

public class FibonacciSeries {
	int f, s, t, n;

	public FibonacciSeries(int n) {

		f = 1;
		s = 2;
		System.out.println(f);
		System.out.println(s);
		for (int i = 3; i <= n; i++) {
			t = f + s;
			System.out.println(t);
			f = s;
			s = t;
		}
	}

	public static void main(String args[]) {
		FibonacciSeries f = new FibonacciSeries(6);

	}

}