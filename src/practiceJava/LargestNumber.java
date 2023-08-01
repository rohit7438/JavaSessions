package practiceJava;

public class LargestNumber {

	int arry[] = { 1, 9, 5, 3, 0, 8, 7, 9 };
	int a = arry[0];

	public void findLargestDigit() {

		for (int i = 0; i < arry.length; i++) {

			for (int j = 1; j < arry.length; j++) {

				if (arry[j] > a) {
					a = arry[i];
				}
			}

		}
		System.out.println(a);
	}

	public static void main(String args[]) {
		LargestNumber obj = new LargestNumber();
		obj.findLargestDigit();
	}

}
