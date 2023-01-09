import java.util.ArrayList;

public class Course {
	private String name;
	private String courseCode;
	private int credits;
	private String cycle;
	private String responsibleId;
	private String responsibleName;
	private ArrayList<Teacher> teaches;

//constructors
	public Course() {
		this.teaches = new ArrayList<Teacher>();

	}

	public Course(String name, String courseCode, int credits, String cycle, String responsibleId, String responsibleName) {
		this.name = name;
		this.courseCode = courseCode;
		this.credits = credits;
		this.cycle = cycle;
		this.responsibleId = responsibleId;
		this.responsibleName = responsibleName;
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

	public String getResponsibleId() {
		return responsibleId;
	}

	public void setResponsibleId(String responsibleId) {
		this.responsibleId = responsibleId;
	}

	public String getResponsibleName() {
		return responsibleName;
	}

	public void setResponsibleName(String responsibleName) {
		this.responsibleName = responsibleName;
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

	

}
