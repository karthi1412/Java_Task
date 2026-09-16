package sample;

public abstract class Employee {
	
	String name;
	
	public Employee( String name) {
	this.name = name;
	}
	
	abstract double calculateSalary();

	void main() {
		System.out.println(name + "Logged In");
	}
	
}
