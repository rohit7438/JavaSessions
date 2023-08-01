package practiceJava;

public class Fabonacci {

	public void createFabo() {
int temp = 0; int temp1 = 1; int temp3;
System.out.print("0"); 
		for (int i = 0; i < 10; i++) {
		temp3 = temp + temp1;
		temp=temp1;
		temp1 = temp3;
	
			
			System.out.print ( " "+temp1);
		}
		
		
		
		
		
	}

	public static void main(String[] args) {
		Fabonacci obj = new Fabonacci();
		obj.createFabo();

	}

}
