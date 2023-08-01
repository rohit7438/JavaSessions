package practiceJava;
import java.util.Scanner;

public class Factoorial {
	
	
	
	
	public void calculate() {
		
	Scanner obj = new Scanner(System.in);
		
	System.out.println("Enter number :");
	
	int num = obj.nextInt(); 
	int temp = num;
	
	for (int i = num-1; i >= 1; i--) {
		
		temp = temp*i;
		
		
	}
	System.out.println(temp);
		
	}
	
	
	public static void main(String[]args) {
		Factoorial obj = new Factoorial();
		obj.calculate();
	}

}
