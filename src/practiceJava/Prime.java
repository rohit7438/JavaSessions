package practiceJava;

import java.util.Scanner;

public class Prime {

	public void primeCalculation() {

		Scanner obj = new Scanner(System.in);
		System.out.println("Enter number : ");
		int num = obj.nextInt();
		int temp = 0;

		for (int i = 2; i < num; i++) {

		
			if (num % i == 0) {

				temp = temp + 1;
			}

		}

		if (temp > 0) {
			System.out.println("Number is not prime");
		}
		else {
			System.out.println("NUmber is prime");
		}
	}

	public static void main(String[] args) {
		Prime obj1 = new Prime();
		obj1.primeCalculation();
	}

}
