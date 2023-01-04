import java.util.ArrayList;

public class Course {
	private String name;
	private String courseCode;
	private int credits;
	private String cycle;
	private String responsible;
	private ArrayList<Teacher> teaches;

//constructors
	public Course() {
		this.teaches = new ArrayList<Teacher>();

	}

	public Course(String name, String courseCode, int credits, String cycle, String responsible){
		this.name = name;
		this.courseCode = courseCode;
		this.credits = credits;
		this.cycle = cycle;
		this.responsible = responsible;
		this.teaches = new ArrayList<Teacher>();

	}

//Getters & Setters
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCourseCode() {
		return courseCode;
	}

	public void setCourseCode(String courseCode) {
		this.courseCode = courseCode;
	}

	public int getCredits() {
		return credits;
	}

	public void setCredits(int credits) {
		this.credits = credits;
	}

	public String getCycle() {
		return cycle;
	}

	public void setCycle(String cycle) {
		this.cycle = cycle;
	}

	public String getResponsible() {
		return responsible;
	}

	public void setResponsible(String responsible) {
		this.responsible = responsible;
	}

	public ArrayList<Teacher> getTeaches() {
		return teaches;
	}

	public void setTeaches(ArrayList<Teacher> teaches) {
		this.teaches = teaches;
	}


	public void addCourseTeacher(Teacher teacher) {
		this.teaches.add(teacher);
	}


	public void removeCourseTeacher(Teacher teacher) {
		this.teaches.remove(teacher);

	}

	public void addResponsible() {

	}

	public void removeResponsible() {

	}

}
