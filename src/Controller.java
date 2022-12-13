import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class Controller implements ActionListener {

	private View view;
	private Teacher teacher;
	private Department department;
	private Course course;
	//private CourseTableModel courseTableModel = new CourseTableModel();
	Controller(View view, Teacher teacher, Department department, Course course) {
		this.view = view;
		this.teacher = teacher;
		this.department = department;
		this.course = course;
		declareListeners();


	}

	private void declareListeners() {
		view.getBtnAddCourse().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			

				String courseName = view.getTextFieldAddCourseName().getText();
				String courseCode = view.getTextFieldCourseCode().getText();
				String cycle = view.getTextFieldCycle().getText();

				
				String strCourseCredit = "12";

				int courseCredit = Integer.parseInt(strCourseCredit.trim());
			

				Course tmpCourse = new Course(courseName, courseCode, courseCredit, cycle);
			


				
			//CourseTableModel courseTableModel = new CourseTableModel();
view.getCourseTableModel().addCourse(tmpCourse);		

			}
		});

		view.getAddDepartmentItem().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				System.out.println("hej");
			}
		});

		view.getBtnAddTeacher().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String teacherName = view.getTextFieldAddTeacherName().getText();
				String teacherID = view.getTextFieldAddTeacherEmployeeID().getText();
				String teacherTitle = view.getTextFieldAddTeacherTitle().getText();
				String teacherAddress = view.getTextFieldAddTeacherAddress().getText();
				//String teacherSalary = view.getTextFieldAddTeacherHourlySalary().getText();
				String strTeacherSalary = view.getTextFieldAddTeacherHourlySalary().getText();

				int teacherSalary = Integer.parseInt(strTeacherSalary);
				System.out.println("Hej");

				Teacher tmpTeacher = new Teacher(teacherName, teacherID, teacherTitle, teacherAddress, teacherSalary);
				
				
//				Teacher tmpTeacher = new Teacher();
//				tmpTeacher.setAddress(teacherAddress);
//				tmpTeacher.setCourse(null);
//				tmpTeacher.setEmployeeId(teacherID);
//				tmpTeacher.setHourlySalary(teacherSalary);
//				tmpTeacher.setName(teacherName);
//				tmpTeacher.setTitle(teacherTitle);
//				tmpTeacher.setTaught(null);
//				
//	TeacherTableModel teacherTableModel = new TeacherTableModel();
//								
//				teacherTableModel.addTeacher(tmpTeacher);
				
			view.getTeacherTableModel().addTeacher(tmpTeacher);
			

			}
		});

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub

	}

}
