package Method;
import java.util.Scanner;

public class SimpleInterest {
	float p, r, t, SI;

	public void ssimpleInt(float p,float r,float t) {
		SI = p * r * t / 100;
		System.out.println("Simple Interest is="+SI);
	}
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter principal Amount");
		float p = sc.nextFloat();
		System.out.println("Enter Rate of interest");
		float r = sc.nextFloat();
		System.out.println("Enter time period");
		float t = sc.nextFloat();
		
		SimpleInterest s1 = new SimpleInterest();
		s1.ssimpleInt(p,r,t);
		
	}
}
