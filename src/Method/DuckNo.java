package Method;

public class DuckNo {
	void checkDuckNo(int n) {
		int digit, c = 0;
		int d = n;
		while (n > 0)
		{
			digit = n % 10;
			if (digit == 0)

				c++;
			    n = n / 10;
		}
		if (c > 0) 
		{
			System.out.println(d + " " + "is a Duck no");
		} else {
			System.out.println(d + " " + "is not a Duck no");
		}
	}

	public static void main(String args[]) {
		DuckNo obj = new DuckNo();

		obj.checkDuckNo(02105);
		// checkDuckNo(201);
	}
}
