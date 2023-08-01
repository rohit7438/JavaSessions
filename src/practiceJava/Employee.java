package practiceJava;

public class Employee {
	
	private int id;
	private String name;
	private Long salary;

	
	
	public Employee(int id, String name, Long salary) {
		this.id = id;
		this.name= name;
		this.salary= salary;
		setSalary(salary);
	}

public int getID() {
	return id;
}
public String getname() {
	return name;
}
public Long getsalary() {
	return salary;
}

public void setSalary(Long salary) {
	this.salary = salary*10L;
}
	

public static void main(String[]args) {
	Employee obj = new Employee(123, "Rohit",2000000L);
	
	System.out.println(obj.getID());
	System.out.println(obj.getname());
	System.out.println(obj.getsalary());

}
	
}
