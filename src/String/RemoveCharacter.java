package String;

public class RemoveCharacter {
	public static void removeChar(String str, char c) {
		int length = str.length();
		String finalstr = "";
		for (int i = 0; i < length; i++) {
			if (str.charAt(i) != 'C') {
				finalstr = finalstr + str.charAt(i);
			}
		}
		System.out.println(finalstr);
	}

	public static void main(String args[]) {
		String str = "CloudTeCh";
		// System.out.println(str.replaceAll("C", ""));
		// char ch='C';
		removeChar(str, 'C');
	}
}
