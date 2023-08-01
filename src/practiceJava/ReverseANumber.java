package practiceJava;

public class ReverseANumber {

	public static void main(String[] args) {
		int num = 123321;
		int temp = num;
		int rem = 0;
		int rev = 0;

		while (num > 0) {

			rev = num % 10;
			rem = rem * 10 + rev;
			num = num / 10;

		}
		if (temp == rem) {
			System.out.println("Number is palindrome");

		}
		else {
			System.out.println("Not Palindrome");
		}
	}

}
