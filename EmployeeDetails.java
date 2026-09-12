package sample;

public class EmployeeDetails {
	
	private int id;
	private String employeeName;
	private boolean isActive;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public boolean getIsActive() {
		return isActive;
	}
	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}
	

	@Override
	public String toString() {
		return "EmployeeDetails [id=" + id + ", employeeName=" + employeeName + ", isActive=" + isActive + "]";
	}



}
