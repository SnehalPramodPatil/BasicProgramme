package String;

public class RevStringUsingRecursion {
	public String getRevString(String str) {
		if (str.isEmpty()) {
			return str;
		}
			return getRevString(str.substring(1)) + str.charAt(0);
		
	}

	public static void main(String args[]) {
		RevStringUsingRecursion r1 = new RevStringUsingRecursion();
		System.out.println(r1.getRevString("Welcome"));
	}
}
