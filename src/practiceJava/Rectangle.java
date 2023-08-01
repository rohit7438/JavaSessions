package practiceJava;

public class Rectangle {

	double length;
	double width;

	public Rectangle() {
		length = 0.0;
		width = 0.0;
		calculateArea(length, width);
	}

	public Rectangle(double length, double width) {
		this.length = length;
		this.width = width;
		calculateArea(length, width);
	}

	public void calculateArea(double length, double width) {
		double area = length * width;
		System.out.println(area);
		Contructor obj3 = new Contructor();
		obj3.methodToCall();
	}
	
	public static void main(String[]args) {
		Rectangle obj = new Rectangle();
		Rectangle obj1 = new Rectangle(23.4, 5.3);
		
	}
	
}
