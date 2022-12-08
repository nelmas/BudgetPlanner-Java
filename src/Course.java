import java.util.ArrayList;

public class Course {
private String name;
private String courseCode;
private int credits;
private String cycle;
private Teacher responsible;
private ArrayList <Teacher> teaches;



//constructors
public Course() {
	this.setTeaches(new ArrayList<Teacher>()); 

}

public Course(String name, String courseCode, int credits, String cycle, Teacher responsible) {
 this.name = name;
 this.courseCode = courseCode;
 this.credits = credits;
 this.cycle = cycle;
 this.responsible = responsible;
 this.setTeaches(new ArrayList<Teacher>()); 

}


//instansiera andra klasser
Teacher teacher = new Teacher();
Department department = new Department();



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

public Teacher getResponsible() {
	return responsible;
}

public void setResponsible(Teacher responisble) {
	this.responsible = responisble;
}

public ArrayList <Teacher> getTeaches() {
	return teaches;
}

public void setTeaches(ArrayList <Teacher> teaches) {
	this.teaches = teaches;
}

//Methods

public void createCorse(){
	
	
}

public void readCorse(){
	
	
}

public void deleteCorse(){
		
}

public void displayAllTeachers() {
for (int i = 0; i>teaches.size(); i++ ) {
	teacher.getName();
	teacher.getEmployeeId();
}

}
public void displayResponsible() {
	responsible.getName();
	responsible.getEmployeeId();
	responsible.getTitle();
	
}

public void addTeacher(Teacher teacher) {
	this.teaches.add(teacher);
}
public void removeTeacher(Teacher teacher) {
	this.teaches.remove(teacher);
	
}
public void addResponsible() {
	
	
}
public void removeResponsible() {
}


}


