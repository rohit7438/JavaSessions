package practiceJava;

public class AllPrimeNumberTill100 {

	public void calculate() {
		int temp = 0;
		for (int i = 2; i <= 100; i++) {

			for (int j = 2; j < i; j++) {

				if (i % j == 0) {
					temp = temp + 1;
				}

			}
			if (temp==0) {
				System.out.println(i + "is prime");
			}
			else {
				temp = 0;
			}

		}
	}

	public static void main(String[] args) {

		AllPrimeNumberTill100 obj = new AllPrimeNumberTill100();
		obj.calculate();

	}

}
