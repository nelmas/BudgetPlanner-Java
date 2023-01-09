
public class Main {

	public static void main(String[] args) {

		View view = new View();
		Department department = new Department();
		Teacher teacher = new Teacher();
		Course course = new Course();
		TeacherTableModel teacherTableModel = new TeacherTableModel();
		Controller controller = new Controller(view, teacher, department, course, teacherTableModel);

		Department department1 = new Department("Systeminstitutet", "Lund", 8000);
		view.getDepartmentTableModel().addDepartment(department1);

		Teacher teacher1 = new Teacher("Astrid Andersson", "As7776An", "Lecturer", "Lund", 120, "Systeminstitutet");
		view.getTeacherTableModel().addTeacher(teacher1);;
		department1.addTeacher(teacher1);
	}  
}
