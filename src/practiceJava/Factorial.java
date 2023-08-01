package practiceJava;

public class Factorial {

	public static void main(String[] args) {

		int num = 8;
		int temp = 1;
		for (int i = num; i >= 2; i--) {

			temp = temp * i;
				
		}
		System.out.println(temp);
	}

}
