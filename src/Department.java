import java.util.ArrayList;

public class Department {

	// Declare attributes

	private String name;
	private Teacher works;
	private String address;
	private int budget;
	private ArrayList<Teacher> teachers;
	

	// constructors

	public Department() {
	}

	public Department(String name, String address, int budget) {
		this.address = address;
		this.budget = budget;
		this.name = name;
		this.teachers = new ArrayList<Teacher>();
		
	}

	// getters and setters

	public Teacher getWorks() {
		return works;
	}

	public void setWorks(Teacher works) {
		this.works = works;
	}

	public ArrayList<Teacher> getTeacher() {
		return teachers;
	}

	public void setTeacher(ArrayList<Teacher> teacher) {
		this.teachers = teacher;

	}  

	

	

	

	public String getName() {
		return name;
	}

	public String getAddress() {
		return address;
	}

	public int getBudget() {
		return budget;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public void setBudget(int budget) {
		this.budget = budget;
	}

	// add teacher method
	public void addTeacher(Teacher teacher) {
		this.teachers.add(teacher);
	}

	// remove teacher method
	public void removeTeacher(Teacher teacher) {
		this.teachers.remove(teacher);

	}
	// find Teacher
	public Teacher findTeacher(String employeeID) {
		for (Teacher teacher : teachers) {
			if (teacher.getEmployeeId().equals(employeeID)) {
				return teacher;
			}
		}
		return null;
	}

	
	

}
