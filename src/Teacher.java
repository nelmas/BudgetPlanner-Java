import java.util.ArrayList;

public class Teacher {

	private String employeeId;
	private String name;
	private String title;
	private String address;
	private int hourlySalary;
	private ArrayList <Course> taught;
	private ArrayList<Course> course;
	
	//Constructors
	public Teacher(String employeeId, String name, String title, String address, int hourlySalary) {
		this.employeeId = employeeId;
		this.name = name;
		this.title = title;
		this.address = address;
		this.hourlySalary = hourlySalary;
		this.taught = new ArrayList<Course>();
		this.course = new ArrayList<Course>();
	}
	
	public Teacher() {
		this.taught = new ArrayList<Course>();
		
	}
	//Instances
	
	
	//Getters & Setters
	public ArrayList<Course> getTaught() {
		return taught;
	}

	public void setTaught(ArrayList<Course> taught) {
		this.taught = taught;
	}
	public ArrayList<Course> getCourse() {
		return course;
	}


	public void setCourse(ArrayList<Course> course) {
		this.course = course;
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
	
	//Methods
	public void addCourse(Course course) {
		this.course.add(course);
	}
	
	//remove teacher method
	public void removeCourse(Course course) {
		this.course.remove(course);
		
	}
}
