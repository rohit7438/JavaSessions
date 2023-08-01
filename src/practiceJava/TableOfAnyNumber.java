package practiceJava;

import java.io.InputStreamReader;
import java.util.Scanner;

public class TableOfAnyNumber {

	public void Table() throws Exception {
		try {
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter your number:");
		int num = obj.nextInt();

		
			if (num >= 1) {

				for (int i = 1; i <= 10; i++) {

					System.out.println(num + " * " + i + " = " + num * i);

				}
			} else {
				System.out.println("Enter correct number");
			}
		} catch (Exception e) {
			throw new Exception("Do not enter special characters");
		}

	}

	public static void main(String[] args) throws Exception {
		TableOfAnyNumber obj = new TableOfAnyNumber();
		obj.Table();

	}
}
