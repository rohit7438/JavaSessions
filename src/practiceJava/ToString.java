package practiceJava;

public class ToString {

	public static void main(String[] args) {
		String str = "naman"; // having a string
		char arry[] = str.toCharArray(); // converting string to array
		String str1 = arry.toString(); // again converting array to string
		System.out.println(str1); 
		// This gives a random value, how can I get the actual value in string type variable
	}

}
