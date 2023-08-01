package practiceJava;

public class DuplicateElementArray {

	public static void main(String[] args) {

		int arry[] = { 1, 5, 2, 8, 4, 5 };
		int temp = 0;

		for (int i = 0; i < arry.length; i++) {

			for (int j = i + 1; j < arry.length; j++) {

				if (arry[i] == arry[j]) {
					System.out.println("Duplicate element " + arry[j]);
					temp++;
				}

			}

		}
		if (temp == 0) {
			System.out.println("No Duplicate");
		}
	}

}
