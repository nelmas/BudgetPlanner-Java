
public class Main {

	public static void main(String[] args) {

		View view = new View();
		Department department = new Department();
		Teacher teacher = new Teacher();
		Course course = new Course();
		TeacherTableModel teacherTableModel = new TeacherTableModel();
		Controller controller = new Controller(view, teacher, department, course, teacherTableModel);

		Department department1 = new Department("Finansinstitutet", "Lundavägen 22", 8000);
		view.getDepartmentTableModel().addDepartment(department1);

		Teacher teacher1 = new Teacher("Astrid Andersson", "As7776An", "Lecturer", "Lundavägen 12", 220, "Finansinstitutet");
		view.getTeacherTableModel().addTeacher(teacher1);

		Course course1 = new Course("SYSA21", "SY04146", 25, "First Cycle", "As7776An", "Astrid Andersson");
		view.getCourseTableModel().addCourse(course1);

	}  
}
