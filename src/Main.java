
public class Main {

	public static void main(String[] args) {

		View view = new View();
		Department department = new Department();
		Teacher teacher = new Teacher();
		Course course = new Course();
		TeacherTableModel teacherTableModel = new TeacherTableModel();
		Controller controller = new Controller(view, teacher, department, course, teacherTableModel);

	}  
}
