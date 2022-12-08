import java.util.ArrayList;

public class Course {
private String name;
private String courseCode;
private int credits;
private String cycle;
private ArrayList <Teacher> thaughtBy;


public Course() {
	this.thaughtBy = new ArrayList<Teacher>(); 

}

public Course(String name, String courseCode, int credits, String cycle) {
 this.name = name;
 this.courseCode = courseCode;
 this.credits = credits;
 this.cycle = cycle;
this.thaughtBy = new ArrayList<Teacher>(); 

	
}

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
	



	}


