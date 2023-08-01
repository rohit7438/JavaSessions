package practiceJava;

public class Car {
	String make;
	String model;
	int year;
	
	
	
	
	public Car(String make, String model, int year) {
		this.make=make;
		this.model=model;
		this.year=year;
		
	}
	
	public Car() {
		this.make="Unkown";
		this.model="Unkown";
		this.year=0;
		
	}

	
	public static void main(String args[]) {
		Car obj = new Car("Merc", "GLE", 2024);
		Car obj1 = new Car();
		System.out.println(obj.make+" "+ obj.model +" "+obj.year);
		System.out.print(obj1.make+" "+ obj1.model +" "+obj1.year);
		
	}
	
	
}
