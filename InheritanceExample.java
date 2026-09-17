package sample;

class EmployeeData{
	int employeeId;
	String emp_name;
	int salary;
	public EmployeeData(int employeeId, String emp_name, int salary) {
		super();
		this.employeeId = employeeId;
		this.emp_name = emp_name;
		this.salary = salary;
	}
	
}

class Developer extends EmployeeData{
	String techSkills;
	public Developer(int employeeId, String emp_name, int salary, String techSkills) {
		super(employeeId, emp_name, salary);
		this.techSkills = techSkills;
		
	}
	@Override
	public String toString() {
		return "Developer [techSkills=" + techSkills + ", employeeId=" + employeeId + ", emp_name=" + emp_name
				+ ", salary=" + salary + "]";
	}
	
	
}

class Tester extends EmployeeData{
	String frameworksKnown;
	public Tester(int employeeId, String emp_name, int salary, String frameworksknown) {
		super(employeeId, emp_name, salary);
		this.frameworksKnown = frameworksknown;
	}
	@Override
	public String toString() {
		return "Tester [frameworksKnown=" + frameworksKnown + ", employeeId=" + employeeId + ", emp_name=" + emp_name
				+ ", salary=" + salary + "]";
	}
	
	
}

public class InheritanceExample {

	public static void main(String[] args) {
		Developer developer = new Developer(1,"John", 40000, "Java");
		System.out.println(developer);
		
		Tester tester = new Tester(2,"JD", 50000, "selenium");
		System.out.println(tester);
	}

}
