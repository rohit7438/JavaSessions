package practiceJava;

public class Contructor {

	public  Contructor() {
		System.out.println("contructor with no parameter");
	}

	public Contructor(int a) {
		System.out.println("contructor with int parameter");
	}

	public Contructor(int a, String b) {
		System.out.println("contructor with int parameter");
	}
	
	public void methodToCall() {
		System.out.println("Method from another class");
	}

	
	public static void main(String[]args) {
		Contructor obj = new Contructor();
	}
	
}
