
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

		TeacherHours teacherHours = new TeacherHours("As7776An", "SY04146", 200);
		view.getCourseTeacherTableModel().addHoursTaught(teacherHours);
		
		Department department2 = new Department("Teknikinstitutet", "Lundavägen 16", 10000);
		view.getDepartmentTableModel().addDepartment(department2);

		Teacher teacher2 = new Teacher("Lennart Larsson", "Le2648La", "Lecturer", "Lundavägen 8", 200, "Teknikinstitutet");
		view.getTeacherTableModel().addTeacher(teacher2);

		Course course2 = new Course("COUC23", "CO08983", 20, "First Cycle", "Le2648La", "Lennart Larsson");
		view.getCourseTableModel().addCourse(course2);

		TeacherHours teacherHours2 = new TeacherHours("Le2648La", "CO08983", 80);
		view.getCourseTeacherTableModel().addHoursTaught(teacherHours2);
		
		

	}  
}
