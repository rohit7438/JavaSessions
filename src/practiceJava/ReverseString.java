package practiceJava;

public class ReverseString {

	public static void main(String[] args) {
		String a ="gagag" ;
		String temp = "";
		char arry[] = a.toCharArray();
		for (int i = a.length() - 1; i >= 0; i--) {

			temp = temp + arry[i];

		}
		System.out.println(temp);
		System.out.println(a);
		if (a.equals(temp)) {
			System.out.println("String is palindrome");
		}
		else  {
			System.out.println("String is not palindrome");
		}
	}

}
