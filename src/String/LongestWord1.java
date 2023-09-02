

package String;

public class LongestWord1 {
	public static void main(String args[]) {
		String str = "Welcome to Java Programming";
		int length = str.length();
		String w = "", lw = " ";
		str = str + " ";
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) != ' ') {
				w = w + str.charAt(i);
			} else {
				if (w.length() > lw.length())
				{
					lw = w;
				}
				w = "";
			}

		}
		System.out.println("Longest Word is: " + lw);
		System.out.println("no of characters in longest word is: " + lw.length());
	}
}
