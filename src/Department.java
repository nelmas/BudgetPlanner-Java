import java.util.ArrayList;



public class Department {

	private String name;
	private Teacher works;
	private String address;
	
	private int budget;
	private ArrayList<Teacher> teacher = new ArrayList<Teacher>();
	private ArrayList<Course> course = new ArrayList<Course>();
	
	
	
	public Department(String name, String address, int budget) {
		this.address = address;
		this.budget = budget;
		this.name = name;
		this.teacher = new ArrayList<Teacher>();
		this.course = new ArrayList<Course>();
	}
	
	public Teacher getWorks() {
		return works;
	}

	public ArrayList<Course> getCourse() {
		return course;
	}

	public void setWorks(Teacher works) {
		this.works = works;
	}

	public void setCourse(ArrayList<Course> course) {
		this.course = course;
	}

	public Department () {
		
	}
	public ArrayList<Teacher> getTeacher() {
		return teacher;
	}
	public void setTeacher(ArrayList<Teacher> teacher) {
		this.teacher = teacher;
		
	}
	public void addTeacher(Teacher teacher) {
		this.teacher.add(teacher);
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
	
	public static void main(String[] args) {
		
		
				

	}

}
