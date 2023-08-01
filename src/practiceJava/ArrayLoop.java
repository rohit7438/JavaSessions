package practiceJava;

public class ArrayLoop {

	public static void main(String[] args) {


		int myarry[] = new int[5];

		myarry[0] = 1;
		myarry[1] = 2;
		myarry[2] = 3;
		myarry[3] = 4;
		myarry[4] = 5;
		System.out.println(myarry.length);
		for (int i = 0; i < myarry.length; i++) {
			System.out.println("count:" + i);
			System.out.println(myarry[i]);
		}

	}

}
