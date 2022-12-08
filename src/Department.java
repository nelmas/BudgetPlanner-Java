import java.util.ArrayList;



public class Department {

	private String name;
	
	private String address;
	
	private int budget;
	private ArrayList<Teacher> teacher = new ArrayList<Teacher>();
	
	
	
	public Department(String name, String address, int budget) {
		this.address = address;
		this.budget = budget;
		this.name = name;
		this.teacher = new ArrayList<Teacher>();
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
