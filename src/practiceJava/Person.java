package practiceJava;

public class Person {

	public String name;
	int age;
	char gender;
	double height;


	class AnotherPerson {
			public void myMethod() {
				System.out.println("I have the power");
			}
				
			}	
	
	
	public void myMethod(int a , int b) {
		int c = a + b;
		System.out.println(c);
	}
	
	public Person(String name, int age, char gender, double height) {
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.height = height;
		AnotherPerson obj = new AnotherPerson();
		obj.myMethod();
		myMethod(5, 6);
		Person obj2 = new Person();
		
		
	}
	
	public Person() {
		System.out.println("No parameter constructor");
		
		
	}
	
	
public static void main(String[]args) {
	Person obj = new Person("Rohit", 30, 'M', 6.5);
	Person obj1 = new Person("Rohit Pro", 18, 'M', 8.7);
	System.out.println(obj.name +" "+ obj.age+" "+ obj.gender+" "+ obj.height);
	System.out.println(obj1.name +" "+ obj1.age+" "+ obj1.gender+" "+ obj1.height);
}



}
