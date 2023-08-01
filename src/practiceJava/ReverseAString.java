package practiceJava;

public class ReverseAString {

	public static void main(String[] args) {

		String str = "nsaman";
		String rev = "";
		char[] arry = str.toCharArray();
		for (int i = arry.length - 1; i >= 0; i--) {
			rev = rev + str.charAt(i);

		}

		if (str.equals(rev)) {

			System.out.println("Palindrome");
		} else {
			System.out.println("Not palondrome");
		}
	}

}
