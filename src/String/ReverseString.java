package String;

public class ReverseString {
	public static void main(String args[]) {
		String str = "Welcome to java,c++,phyton world";
		
		// String revStr="";
		int count = 0;
		int count1 = 0;
		//String[] str1=str.split("");
		System.out.println("print string:");
		for (int i = 0; i < str.length(); i++) {
			char c=str.charAt(i);
			System.out.print(str.charAt(i));
		}

		System.out.println();
		System.out.println("Reverse String: ");
		for (int i = str.length() - 1; i >= 0; i--) {
			// revStr=revStr+str.charAt(i);
			System.out.print(str.charAt(i));
			count++;
			if (str.charAt(i) != ' ' && str.charAt(i)!=',') {
				count1++;
			}
		}
		// System.out.println("Reverse String: "+str.charAt(i));
		System.out.println();
		System.out.println("Total no of characters in string with space: " + count);
		System.out.println("Total no of characters in string without space: " + count1);
		int length=str.length();
		System.out.println("length of string is :"+length);

	}
}
