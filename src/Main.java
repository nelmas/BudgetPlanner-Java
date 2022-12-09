
public class Main {

	public static void main(String[] args) {
		
		View view = new View();
		Department department = new Department();
		Teacher teacher = new Teacher();
		Course course = new Course();
		Controller controller = new Controller(view, teacher, department,course);
	

}
}
