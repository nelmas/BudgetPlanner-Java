import java.util.ArrayList;

public class Teacher {

	private String employeeId;
	private String name;
	private String title;
	private String address;
	private int hourlySalary;
	// course can be taught by several teachers
	private ArrayList<Course> taught;

	// teacher can teach several courses
	private ArrayList<Teacher> course;

	// Constructors
	public Teacher( String name,String employeeId, String title, String address, int hourlySalary) {
		this.name = name;
		this.employeeId = employeeId;
		this.title = title;
		this.address = address;
		this.hourlySalary = hourlySalary;
		this.taught = new ArrayList<Course>();
		this.course = new ArrayList<Teacher>();

	}

	public Teacher() {
		this.taught = new ArrayList<Course>();

	}

	// Titles
	enum Titles {
		LECTURER, ASSISTANTPROFESSOR, ASSOCIATEPROFESSOR, PROFESSOR,

		// Titles title = Titles.ASSISTANTPROFESSOR;
		// System.out.println(title);
	}

	// Getters & Setters
	public ArrayList<Course> getTaught() {
		return taught;
	}

	public void setTaught(ArrayList<Course> taught) {
		this.taught = taught;
	}
	
	public void addTaught(Course taught) {
		this.taught.add(taught);

		
	}
	public void removeTaught(Course taught) {
		this.taught.remove(taught);

		
	}

	public ArrayList<Teacher> getCourse() {
		return course;
	}

	public void setCourse(ArrayList<Teacher> course) {
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

	// Methods
	public void addCourse(Teacher course) {
		this.course.add(course);
	}

	// remove teacher method
	public void removeCourse(Teacher course) {
		this.course.remove(course);

	}

}
