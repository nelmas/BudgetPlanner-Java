
public class Main {

	public static void main(String[] args) {

		View view = new View();
		Department department = new Department();
		Teacher teacher = new Teacher();
		Course course = new Course();
		Course course1 = new Course("SYSA21", "ad77833", 25, "First Cycle", "As7776An");
		view.getCourseTableModel().addCourse(course1);
		TeacherTableModel teacherTableModel = new TeacherTableModel();
		TeacherHours teacherHours = new TeacherHours("As7776An", "ad77833", 350);
		view.getCourseTeacherTableModel().addHoursTaught(teacherHours);
		

		

		Department department1 = new Department("SystemLinjen", "Lundvägen 2", 820);
		view.getDepartmentTableModel().addDepartment(department1);
		
		Teacher teacher1 = new Teacher("Astrid Andersson", "As7776An", "Lecturer", "lundavägen 23", 220, "SystemLinjen"); 
		view.getTeacherTableModel().addTeacher(teacher1);;
		department1.addTeacher(teacher1);
		
		Controller controller = new Controller(view, teacher, department, course, teacherTableModel);

	}  
}
