package String;

public class LowerUpperCaseString {
	public static void main(String args[]) {
		String str = "This is CloudTech This is CloudTech";
		int mid = str.length() / 2;
		String lowercase = "";
		String uppercase = "";
		for (int i = 0; i < str.length(); i++) {
			if (i < mid) {
				lowercase = lowercase + Character.toLowerCase(str.charAt(i));
			} else {
				uppercase = uppercase + Character.toUpperCase(str.charAt(i));
			}

		}

		System.out.println(lowercase + uppercase);
	}
}
