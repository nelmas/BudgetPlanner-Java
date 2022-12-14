import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

public class Controller implements ActionListener {

	private View view;
	private DepartmentRegister departmentRegister;
	private Teacher teacher;
	private Department department;
	private Course course;
	private TeacherTableModel teacherTableModel;
	// private CourseTableModel courseTableModel = new CourseTableModel();

	private CourseTableModel courseTableModel = new CourseTableModel();

	Controller(View view, Teacher teacher, Department department, Course course, DepartmentRegister departmentRegister,
			TeacherTableModel teacherTableModel) {

		this.view = view;
		this.teacher = teacher;
		this.department = department;
		this.course = course;
		this.departmentRegister = departmentRegister;
		this.teacherTableModel = teacherTableModel;
		declareListeners();

	}
	
	//AddCourse
	private void declareListeners() {
		view.getBtnAddCourse().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {

					String courseName = view.getTextFieldAddCourseName().getText();
					String courseCode = view.getTextFieldCourseCode().getText();
					String cycle = view.getTextFieldCycle().getText();

					String strCourseCredit = view.getTextFieldAddCredits().getText();

					int courseCredit = Integer.parseInt(strCourseCredit.trim());

					Course tmpCourse = new Course(courseName, courseCode, courseCredit, cycle);

					if (courseCredit < 0) {
						view.getTextFieldErrorMessageCourses().setText("Credits can't have a negative value");
					} else {

						view.getCourseTableModel().addCourse(tmpCourse);
					}
				} catch (NumberFormatException e3) {
					view.getTextFieldErrorMessageCourses().setText("Credits must be entered in numbers");

				}

			}
		});
		
		//ChangeCourseTable

		view.getCourseTable().getSelectionModel().addListSelectionListener(new ListSelectionListener() {

			public void valueChanged(ListSelectionEvent event) {
				// för att den inte ska printa allt två gånger

				if (!event.getValueIsAdjusting()) {

					view.getTextFieldAddCourseName().setText(view.getCourseTableModel()
							.getValueAt(view.getCourseTable().getSelectedRow(), 0).toString());
					view.getTextFieldCourseCode().setText(view.getCourseTableModel()
							.getValueAt(view.getCourseTable().getSelectedRow(), 1).toString());
					view.getTextFieldAddCredits().setText(view.getCourseTableModel()
							.getValueAt(view.getCourseTable().getSelectedRow(), 2).toString());
					view.getTextFieldCycle().setText(view.getCourseTableModel()
							.getValueAt(view.getCourseTable().getSelectedRow(), 3).toString());

				}
			}

		});

		view.getAddDepartmentItem().addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {

			}

		});

		//AddDepartment
		view.getBtnAddDepartment().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					String departmentName = view.getTextFieldAddDepartmentName().getText();
					String strDepartmentBudget = view.getTextFieldAddDepartmentBudget().getText();
					int departmentBudget = Integer.parseInt(strDepartmentBudget);
					String departmentAddress = view.getTextFieldAddDepartmentAddress().getText();

					Department tmpDepartment = new Department(departmentName, departmentAddress, departmentBudget);

					if (departmentBudget < 0) {
						view.getTextFieldErrorMessageDepartment().setText("Budget can't be a negative value");
					} else {

						view.getDepartmentTableModel().addDepartment(tmpDepartment);
					}
				} catch (NumberFormatException e2) {
					view.getTextFieldErrorMessageDepartment().setText("Please enter numbers for budget");

				}

			}
		});

		//FindTeacher
		view.getBtnFindTeacher().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				try {

					String EmployeeID = view.getTextFieldAddTeacherEmployeeID().getText();
					Teacher tmpTeacher = department.findTeacher(EmployeeID);

					view.getTextFieldAddTeacherName().setText(tmpTeacher.getName());

					System.out.println(tmpTeacher.getName());
				} catch (NumberFormatException e1) {
					view.getTextFieldErrorMessage().setText("Person does not exist");
				}
			}
		});
		
         //AddTeacher
		view.getBtnAddTeacher().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					String teacherName = view.getTextFieldAddTeacherName().getText();
					String teacherID = view.getTextFieldAddTeacherEmployeeID().getText();
					String teacherTitle = view.getTextFieldAddTeacherTitle().getText();
					String teacherAddress = view.getTextFieldAddTeacherAddress().getText();
					// String teacherSalary = view.getTextFieldAddTeacherHourlySalary().getText();
					String strTeacherSalary = view.getTextFieldAddTeacherHourlySalary().getText();

					int teacherSalary = Integer.parseInt(strTeacherSalary);

					if (teacherSalary < 0) {
						view.getTextFieldErrorMessage().setText("Hourly salary can't be a negative value");
					} else {

						Teacher tmpTeacher = new Teacher(teacherName, teacherID, teacherTitle, teacherAddress,
								teacherSalary);

						view.getTeacherTableModel().addTeacher(tmpTeacher);
					}
				} catch (NumberFormatException exception) {
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
