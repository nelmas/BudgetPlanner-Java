

public class Teacher {

	private String employeeId;
	private String name;
	private String title;
	private String address;
	private int hourlySalary;
	
	public Teacher(String employeeId, String name, String title, String address, int hourlySalary) {
		
	}
	
	public Teacher() {
		
	}
	public String getEmployeeId() {
		return employeeId;
	}
		
	public void setEmployeeId(String employeeId) {
		this.employeeId = employeeId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int getHourlySalary() {
		return hourlySalary;
	}

	public void setHourlySalary(int hourlySalary) {
		this.hourlySalary = hourlySalary;
	}

}
