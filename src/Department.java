import java.util.ArrayList;


public class Department {

	// Declare attributes

	private String name;
	private Teacher works;
	private String address;
	private int budget;
	private ArrayList<Teacher> teacher;
	private ArrayList<Department> department;

	// constructors

	public Department() {
	}

	public Department(String name, String address, int budget) {
		this.address = address;
		this.budget = budget;
		this.name = name;
		this.teacher = new ArrayList<Teacher>();
		this.department = new ArrayList<Department>();
	}

	// getters and setters

	public Teacher getWorks() {
		return works;
	}

	public void setWorks(Teacher works) {
		this.works = works;
	}

	public ArrayList<Teacher> getTeacher() {
		return teacher;
	}

	public void setTeacher(ArrayList<Teacher> teacher) {
		this.teacher = teacher;

	}

	public ArrayList<Department> getDepartment() {
		return department;
	}

	public Department findDepartment(String name) {
		for (Department department : department) {
			if (department.findDepartment(name) != null) {
				if (department.findDepartment(name).getName().equals(name))
					return department.findDepartment(name);
			}
		}
		return null;
	}

	public void setDepartment(ArrayList<Department> department) {
		this.department = department;
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
		this.teacher.add(teacher);
	}

	// remove teacher method
	public void removeTeacher(Teacher teacher) {
		this.teacher.remove(teacher);

	}

	// add department
	public void addDepartment(Department department) {
		this.department.add(department);
	}

	// remove department
	public void removeDepartment(Department department) {
		this.department.remove(department);
	}

}
