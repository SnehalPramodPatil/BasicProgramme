package String;

public class EachWordReverse {
	public static void main(String args[]) {
		String str = "Welcome to java programming";
		String[] words = str.split(" "); // [welcome,to,java,programming]
		System.out.println("Lenght of string is: " + words.length);
		String revString = "";
		
		for (int i = 0; i < words.length; i++) {
			String word = words[i];

			String revWord = "";
			for (int j = word.length() - 1; j >= 0; j--) {
				revWord += word.charAt(j); // avaj
			}
			revString += revWord + " ";
		}
		System.out.println("Reverse String : " + revString);
	
	}
}