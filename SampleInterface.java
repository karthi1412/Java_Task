package sample;

public interface SampleInterface {
	
	void methodA();
	
	default  EmployeeDetails generateEmployeeDetails() {
		EmployeeDetails details = new EmployeeDetails();
		details.setId(1);
		details.setEmployeeName("Hari");
		details.setActive(true);
		return details;
	}
	
	public static void infoData() {
		System.out.println("Info Method working");
	}

}