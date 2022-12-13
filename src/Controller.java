import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class Controller implements ActionListener {

	private View view;
	private DepartmentRegister departmentRegister;
	private Teacher teacher;
	private Department department;
	private Course course;
	private TeacherTableModel teacherTableModel;
	//private CourseTableModel courseTableModel = new CourseTableModel();
	
	private CourseTableModel courseTableModel = new CourseTableModel();
	Controller(View view, Teacher teacher, Department department, Course course, DepartmentRegister departmentRegister, TeacherTableModel teacherTableModel) {
		this.view = view;
		this.teacher = teacher;
		this.department = department;
		this.course = course;
		this.departmentRegister = departmentRegister;
		this.teacherTableModel = teacherTableModel;
		declareListeners();


	}

	private void declareListeners() {
		view.getBtnAddCourse().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			

				String courseName = view.getTextFieldAddCourseName().getText();
				String courseCode = view.getTextFieldCourseCode().getText();
				String cycle = view.getTextFieldCycle().getText();

				
				String strCourseCredit = view.getTextFieldAddCredits().getText();

				int courseCredit = Integer.parseInt(strCourseCredit.trim());
			

				Course tmpCourse = new Course(courseName, courseCode, courseCredit, cycle);
			


				
			//CourseTableModel courseTableModel = new CourseTableModel();
view.getCourseTableModel().addCourse(tmpCourse);		

			}
		});
		
		view.getBtnRemoveCourse().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				
			}
				
		});

		view.getBtnAddDepartment().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String departmentName = view.getTextFieldAddDepartmentName().getText();
				String strDepartmentBudget = view.getTextFieldAddDepartmentBudget().getText();
				int departmentBudget = Integer.parseInt(strDepartmentBudget);
				String departmentAddress = view.getTextFieldAddDepartmentAddress().getText();
				
				Department tmpDepartment = new Department(departmentName, departmentAddress, departmentBudget);
				
				view.getDepartmentTableModel().addDepartment(tmpDepartment);

				
			}
		});
		
		view.getBtnFindTeacher().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				try {
				
				String EmployeeID = view.getTextFieldAddTeacherEmployeeID().getText();
				Teacher tmpTeacher = department.findTeacher(EmployeeID);
				
				view.getTextFieldAddTeacherName().setText(tmpTeacher.getName());
				
				
				System.out.println(tmpTeacher.getName());
				}
				catch (NumberFormatException e1) {
					view.getTextFieldErrorMessage().setText("Person does not exist");
				}
			}
		});

		view.getBtnAddTeacher().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
				String teacherName = view.getTextFieldAddTeacherName().getText();
				String teacherID = view.getTextFieldAddTeacherEmployeeID().getText();
				String teacherTitle = view.getTextFieldAddTeacherTitle().getText();
				String teacherAddress = view.getTextFieldAddTeacherAddress().getText();
				//String teacherSalary = view.getTextFieldAddTeacherHourlySalary().getText();
				String strTeacherSalary = view.getTextFieldAddTeacherHourlySalary().getText();

				int teacherSalary = Integer.parseInt(strTeacherSalary);
				

				Teacher tmpTeacher = new Teacher(teacherName, teacherID, teacherTitle, teacherAddress, teacherSalary);
				
				view.getTeacherTableModel().addTeacher(tmpTeacher);
				}catch (NumberFormatException exception) {
					view.getTextFieldErrorMessage().setText("Please only enter numbers");
				}

				
				
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
				
			
			

			}
		});

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub

	}

}
