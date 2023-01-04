import javax.swing.*;
import javax.swing.border.EmptyBorder;

import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class View extends JFrame {

	// JMenuItems
	private JMenuBar menuBar;
	private JMenu departmentMenu;
	private JMenu courseMenu;
	private JMenu teacherMenu;
	private JMenuItem addDepartmentItem;
	private JMenuItem removeDepartmentItem;
	private JMenuItem getCourseInfoItem;
	private JMenuItem editCourseItem;
	private JMenuItem editTeacherItem;
	private JMenuItem setHoursItem;
	private JMenuItem displayTeachers;

	
	private JTabbedPane tabbedPane;
	// JPanels
	private JPanel contentPane;
	private JPanel panelAddTeacher;
	private JPanel panelAddCourses = new JPanel();
	private JPanel panelAddDepartment;

	// JTextFields
	private JTextField textFieldAddDepartmentName;
	private JTextField textFieldAddDepartmentBudget;
	private JTextField textFieldAddDepartmentAddress;
	private JTextField textFieldAddCredits;
	private JTextField textFieldCourseCode;
	private JTextField textFieldAddCourseName;
	private JTextField textFieldAddTeacherName;
	private JTextField textFieldAddTeacherAddress;
	private JTextField textFieldAddTeacherHourlySalary;
	private JTextField textFieldErrorMessageDepartment;
	private JTextField textFieldResponsibleTeacher;
	// JButtons
	private JButton btnAddTeacher;
	private JButton btnRemoveTeacher;
	private JButton btnAddDepartment;
	private JButton btnRemoveDepartment;
	private JButton btnAddCourse;
	private JButton btnRemoveCourse;

	private JButton btnAddCourseTeacher;

	private JButton btnRemoveCourseTeacher;

	private JLabel lblCourseCode;


	// JTables
	private JTable teacherTable;
	private JTable courseTable;
	private JTable departmentTable;

	private JTable courseTeacherTable;

	// instantiate classes
	private TeacherTableModel teacherTableModel;
	private DepartmentTableModel departmentTableModel;

	private CourseTableModel courseTableModel;

	private CourseTeacherTableModel courseTeacherTableModel;

	// JScrollPanes
	private JScrollPane scrollPaneTeacher;
	private JScrollPane scrollPaneDepartment;
	private JScrollPane scrollPaneCourse;


	// JScrollBars
	private JScrollBar scrollBarCourse;
	private JScrollBar scrollBarTeacher;
	private JScrollBar scrollBarDepartment;

	
	private JLabel lblResponsibleTeacher;


	private JTable table;
	private JTextArea textAreaErrorMessageTeacher;
	private JTextArea textAreaErrorMessageCourses;
	
	private JComboBox comboBoxTeacherTitle;
	
	private JTextArea textAreaErrorMessageDepartment;
	private JComboBox comboBoxCoursesCycle;
	private JLabel lblTeacherDepartment;
	private JTextField textFieldTeacherDepartment;
	private JLabel lblHours;
	private JTextField textFieldHours;


	public View() {

		// MainPane
		setTitle("Contoso University");
		setBackground(SystemColor.control);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 942, 806);

		contentPane = new JPanel();

		contentPane.setBackground(SystemColor.control);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		// Department
		tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(0, 0, 926, 745);
		contentPane.add(tabbedPane);

		panelAddDepartment = new JPanel();
		tabbedPane.addTab("Department", null, panelAddDepartment, null);
		panelAddDepartment.setLayout(null);

		textFieldAddDepartmentName = new JTextField();
		textFieldAddDepartmentName.setBounds(91, 25, 130, 26);
		panelAddDepartment.add(textFieldAddDepartmentName);
		textFieldAddDepartmentName.setColumns(10);

		textFieldAddDepartmentBudget = new JTextField();
		textFieldAddDepartmentBudget.setColumns(10);
		textFieldAddDepartmentBudget.setBounds(91, 73, 130, 26);
		panelAddDepartment.add(textFieldAddDepartmentBudget);

		textFieldAddDepartmentAddress = new JTextField();
		textFieldAddDepartmentAddress.setColumns(10);
		textFieldAddDepartmentAddress.setBounds(91, 121, 130, 26);
		panelAddDepartment.add(textFieldAddDepartmentAddress);

		JLabel lbldepartmentName = new JLabel("Name");
		lbldepartmentName.setBounds(20, 30, 61, 16);
		panelAddDepartment.add(lbldepartmentName);

		JLabel lblDepartmentBudget = new JLabel("Budget");
		lblDepartmentBudget.setBounds(20, 78, 61, 16);
		panelAddDepartment.add(lblDepartmentBudget);

		JLabel lblDepartmentAddress = new JLabel("Address");
		lblDepartmentAddress.setBounds(20, 126, 50, 16);
		panelAddDepartment.add(lblDepartmentAddress);

		JLabel lblRemoveDepartment = new JLabel("If you wish to remove a department -");
		lblRemoveDepartment.setBounds(10, 240, 211, 16);
		panelAddDepartment.add(lblRemoveDepartment);

		btnAddDepartment = new JButton("Add");
		btnAddDepartment.setBounds(20, 180, 93, 27);
		panelAddDepartment.add(btnAddDepartment);

		btnRemoveDepartment = new JButton("Remove");

		btnRemoveDepartment.setBounds(128, 180, 93, 27);
		panelAddDepartment.add(btnRemoveDepartment);

		scrollPaneDepartment = new JScrollPane();
		scrollPaneDepartment.setBounds(280, 11, 620, 695);
		panelAddDepartment.add(scrollPaneDepartment);

		scrollBarDepartment = new JScrollBar();
		scrollPaneDepartment.setRowHeaderView(scrollBarDepartment);

		departmentTableModel = new DepartmentTableModel();

		departmentTable = new JTable();

		departmentTable.setModel(departmentTableModel);

		scrollPaneDepartment.setViewportView(departmentTable);

		scrollPaneDepartment.setRowHeaderView(scrollBarDepartment);

		JLabel lblRemoveDepartment2 = new JLabel("Select it and press remove");
		lblRemoveDepartment2.setBounds(10, 267, 211, 16);
		panelAddDepartment.add(lblRemoveDepartment2);

		textAreaErrorMessageDepartment = new JTextArea();
		textAreaErrorMessageDepartment.setEditable(false);
		textAreaErrorMessageDepartment.setBackground(SystemColor.menu);
		textAreaErrorMessageDepartment.setBounds(10, 430, 260, 80);
		panelAddDepartment.add(textAreaErrorMessageDepartment);

		//JLabel lblNewLabel_1 = new JLabel();
		//ImageIcon img = new ImageIcon(this.getClass().getResource("/cantoso.png"));
		//lblNewLabel_1.setIcon(img);
	//	lblNewLabel_1.setBounds(10, 288, 359, 281);
	//	panelAddDepartment.add(lblNewLabel_1);


		//Icon
//		JLabel lblNewLabel_1 = new JLabel();
//		ImageIcon img = new ImageIcon(this.getClass().getResource("/cantoso.png"));
//		lblNewLabel_1.setIcon(img);
//		lblNewLabel_1.setBounds(10, 288, 359, 281);
//		panelAddDepartment.add(lblNewLabel_1);

		scrollBarDepartment = new JScrollBar();

		// Teacher
		panelAddTeacher = new JPanel();
		tabbedPane.addTab("Teacher", null, panelAddTeacher, null);
		panelAddTeacher.setLayout(null);

		JLabel lblFullName = new JLabel("Full Name");
		lblFullName.setBounds(20, 11, 80, 16);
		panelAddTeacher.add(lblFullName);

		JLabel lblTitle = new JLabel("Title");
		lblTitle.setBounds(20, 60, 80, 16);
		panelAddTeacher.add(lblTitle);

		JLabel lblAddress = new JLabel("Address");
		lblAddress.setBounds(20, 111, 80, 16);
		panelAddTeacher.add(lblAddress);

		JLabel lblHourlySalary = new JLabel("Hourly Salary");
		lblHourlySalary.setBounds(20, 161, 80, 16);
		panelAddTeacher.add(lblHourlySalary);

		textFieldAddTeacherName = new JTextField();
		textFieldAddTeacherName.setBounds(100, 6, 130, 26);
		textFieldAddTeacherName.setColumns(10);
		panelAddTeacher.add(textFieldAddTeacherName);

		textFieldAddTeacherAddress = new JTextField();
		textFieldAddTeacherAddress.setBounds(100, 106, 130, 26);
		panelAddTeacher.add(textFieldAddTeacherAddress);
		textFieldAddTeacherAddress.setColumns(10);

		textFieldAddTeacherHourlySalary = new JTextField();
		textFieldAddTeacherHourlySalary.setBounds(100, 156, 130, 26);
		panelAddTeacher.add(textFieldAddTeacherHourlySalary);
		textFieldAddTeacherHourlySalary.setColumns(10);

		btnAddTeacher = new JButton("Add");
		btnAddTeacher.setBounds(20, 260, 100, 30);
		panelAddTeacher.add(btnAddTeacher);

		btnRemoveTeacher = new JButton("Remove");
		btnRemoveTeacher.setBounds(140, 260, 100, 30);
		panelAddTeacher.add(btnRemoveTeacher);

		scrollPaneTeacher = new JScrollPane();
		scrollPaneTeacher.setBounds(274, 11, 620, 680);
		panelAddTeacher.add(scrollPaneTeacher);

		teacherTable = new JTable();

		scrollPaneTeacher.setViewportView(teacherTable);

		teacherTableModel = new TeacherTableModel();

		scrollBarTeacher = new JScrollBar();

		scrollPaneTeacher.setRowHeaderView(scrollBarTeacher);

		teacherTable.setModel(teacherTableModel);

		textAreaErrorMessageTeacher = new JTextArea();
		textAreaErrorMessageTeacher.setBackground(UIManager.getColor("Button.background"));
		textAreaErrorMessageTeacher.setEditable(false);
		textAreaErrorMessageTeacher.setBounds(10, 326, 254, 80);
		panelAddTeacher.add(textAreaErrorMessageTeacher);



		String[] teachers = {"Lecturer", "Assistant Professor ", "Associate Professor ",
				"Professor"};
		comboBoxTeacherTitle = new JComboBox(teachers);
		comboBoxTeacherTitle.setBounds(100, 53, 140, 30);
		panelAddTeacher.add(comboBoxTeacherTitle);

		lblTeacherDepartment = new JLabel("Department");
		lblTeacherDepartment.setBounds(20, 215, 80, 14);
		panelAddTeacher.add(lblTeacherDepartment);

		textFieldTeacherDepartment = new JTextField();
		textFieldTeacherDepartment.setBounds(99, 209, 131, 26);
		panelAddTeacher.add(textFieldTeacherDepartment);
		textFieldTeacherDepartment.setColumns(10);

		contentPane.show();


		// Courses
		tabbedPane.addTab("Courses", null, panelAddCourses, null);
		panelAddCourses.setLayout(null);

		textFieldAddCourseName = new JTextField();
		textFieldAddCourseName.setBounds(120, 67, 130, 26);

		panelAddCourses.add(textFieldAddCourseName);
		textFieldAddCourseName.setColumns(10);

		textFieldAddCredits = new JTextField();
		textFieldAddCredits.setBounds(120, 164, 130, 26);
		panelAddCourses.add(textFieldAddCredits);
		textFieldAddCredits.setColumns(10);


		JLabel lblCourseCredits = new JLabel("Credits");
		lblCourseCredits.setBounds(30, 169, 80, 16);
		panelAddCourses.add(lblCourseCredits);


		JLabel lblNewCycle = new JLabel("Cycle");
		lblNewCycle.setBounds(30, 207, 61, 16);
		panelAddCourses.add(lblNewCycle);


		lblResponsibleTeacher = new JLabel("ID number");
		lblResponsibleTeacher.setBounds(30, 21, 80, 16);
		panelAddCourses.add(lblResponsibleTeacher);


		textFieldCourseCode = new JTextField();
		textFieldCourseCode.setBounds(120, 116, 130, 26);
		panelAddCourses.add(textFieldCourseCode);
		textFieldCourseCode.setColumns(10);

		lblCourseCode = new JLabel("Course Code");
		lblCourseCode.setBounds(30, 121, 80, 16);
		panelAddCourses.add(lblCourseCode);

		btnRemoveCourse = new JButton("Remove Course");

		btnRemoveCourse.setBounds(152, 299, 130, 29);
		panelAddCourses.add(btnRemoveCourse);

		scrollPaneCourse = new JScrollPane();
		scrollPaneCourse.setBounds(30, 379, 866, 327);
		panelAddCourses.add(scrollPaneCourse);

		JScrollPane scrollPaneCourseTeacher = new JScrollPane();
		scrollPaneCourseTeacher.setBounds(286, 11, 610, 357);
		panelAddCourses.add(scrollPaneCourseTeacher);

		btnAddCourse = new JButton("Add Course");

		btnAddCourse.setBounds(30, 299, 115, 29);
		panelAddCourses.add(btnAddCourse);

		courseTable = new JTable();
		courseTeacherTable = new JTable();


		scrollPaneCourse.setViewportView(courseTable);
		scrollPaneCourseTeacher.setViewportView(courseTeacherTable);

		courseTableModel = new CourseTableModel();

		courseTable.setModel(courseTableModel);

		courseTeacherTableModel = new CourseTeacherTableModel();
		courseTeacherTable.setModel(courseTeacherTableModel);

		scrollBarCourse = new JScrollBar();

		scrollPaneCourse.setRowHeaderView(scrollBarCourse);

		textAreaErrorMessageCourses = new JTextArea();
		textAreaErrorMessageCourses.setBounds(152, 468, 523, 45);
		textAreaErrorMessageCourses.setBackground(UIManager.getColor("Button.background"));
		textAreaErrorMessageCourses.setEditable(false);
		panelAddCourses.add(textAreaErrorMessageCourses);

		textFieldResponsibleTeacher = new JTextField();
		textFieldResponsibleTeacher.setBounds(120, 16, 130, 26);
		panelAddCourses.add(textFieldResponsibleTeacher);
		textFieldResponsibleTeacher.setColumns(10);

		comboBoxCoursesCycle = new JComboBox();
		comboBoxCoursesCycle.setBounds(120, 200, 140, 30);
		comboBoxCoursesCycle.setModel(new DefaultComboBoxModel(new String[] {"First Cycle", "Second Cycle", "Third Cycle"}));
		panelAddCourses.add(comboBoxCoursesCycle);

		JLabel lblCourseName = new JLabel("Course Name");
		lblCourseName.setBounds(30, 73, 80, 14);
		panelAddCourses.add(lblCourseName);



		JScrollBar scrollBarCourseTeacher = new JScrollBar();
		scrollPaneCourseTeacher.setRowHeaderView(scrollBarCourseTeacher);

		btnAddCourseTeacher = new JButton("Add Teacher");
		btnAddCourseTeacher.setBounds(30, 339, 115, 29);
		panelAddCourses.add(btnAddCourseTeacher);

		btnRemoveCourseTeacher = new JButton("Remove Teacher");

		btnRemoveCourseTeacher.setBounds(152, 339, 130, 29);
		panelAddCourses.add(btnRemoveCourseTeacher);

		lblHours = new JLabel("Hours ");
		lblHours.setBounds(30, 247, 46, 14);
		panelAddCourses.add(lblHours);

		textFieldHours = new JTextField();
		textFieldHours.setBounds(120, 241, 130, 26);
		panelAddCourses.add(textFieldHours);
		textFieldHours.setColumns(10);


		contentPane.show();





		// MenuBar
		menuBar = new JMenuBar();
		this.setJMenuBar(menuBar);
		departmentMenu = new JMenu("Department");
		courseMenu = new JMenu("Course");

		// Department menu files
		menuBar.add(departmentMenu);
		addDepartmentItem = new JMenuItem("Add Department");
		removeDepartmentItem = new JMenuItem("Remove Department");

		departmentMenu.add(addDepartmentItem);
		departmentMenu.add(removeDepartmentItem);
		teacherMenu = new JMenu("Teacher");

				// Teacher menu files
				menuBar.add(teacherMenu);
				editTeacherItem = new JMenuItem("Edit Teacher Info");
				setHoursItem = new JMenuItem("Set Hours for Teacher");
				displayTeachers = new JMenuItem("Display Teachers");

						teacherMenu.add(editTeacherItem);
						teacherMenu.add(setHoursItem);
						teacherMenu.add(displayTeachers);

		// Course menu files
		menuBar.add(courseMenu);
		getCourseInfoItem = new JMenuItem("Get Course Info");
		editCourseItem = new JMenuItem("Edit Course");

		courseMenu.add(getCourseInfoItem);
		courseMenu.add(editCourseItem);

		this.setVisible(true);
	}

	// Getters

	public JTable getDepartmentTable() {
		return departmentTable;
	}

	public DepartmentTableModel getDepartmentTableModel() {
		return departmentTableModel;
	}

	public JPanel getContentPane() {
		return contentPane;
	}

	public JMenu getDepartmentMenu() {
		return departmentMenu;
	}

	public JMenu getCourseMenu() {
		return courseMenu;
	}

	public JMenu getTeacherMenu() {
		return teacherMenu;
	}

	public JMenuItem getAddDepartmentItem() {
		return addDepartmentItem;
	}

	public JMenuItem getRemoveDepartmentItem() {
		return removeDepartmentItem;
	}

	public JMenuItem getGetCourseInfoItem() {
		return getCourseInfoItem;
	}

	public JMenuItem getEditCourseItem() {
		return editCourseItem;
	}

	public JMenuItem getEditTeacherItem() {
		return editTeacherItem;
	}

	public JMenuItem getSetHoursItem() {
		return setHoursItem;
	}

	public JMenuItem getDisplayTeachers() {
		return displayTeachers;
	}

	// ButtonGetters
	public JButton getBtnAddTeacher() {
		return btnAddTeacher;
	}

	public JButton getBtnRemoveTeacher() {
		return btnRemoveTeacher;
	}

	public JButton getBtnAddDepartment() {
		return btnAddDepartment;
	}

	public JButton getBtnRemoveDepartment() {
		return btnRemoveDepartment;
	}

	public JButton getBtnAddCourse() {
		return btnAddCourse;
	}

	public JButton getBtnRemoveCourse() {
		return btnRemoveCourse;
	}




	public JTextField getTextFieldAddTeacherName() {
		return textFieldAddTeacherName;
	}

	public JTextField getTextFieldAddDepartmentName() {
		return textFieldAddDepartmentName;
	}

	public JTextField getTextFieldAddDepartmentBudget() {
		return textFieldAddDepartmentBudget;
	}

	public JTextField getTextFieldAddDepartmentAddress() {
		return textFieldAddDepartmentAddress;
	}

	public JTextField getTextFieldCourseCode() {
		return textFieldCourseCode;
	}

	public JTextField getTextFieldAddCourseName() {
		return textFieldAddCourseName;
	}

	public void setTextFieldAddCourseName(JTextField textFieldAddCourseName) {
		this.textFieldAddCourseName = textFieldAddCourseName;
	}



	public JTextField getTextFieldAddTeacherAddress() {
		return textFieldAddTeacherAddress;
	}

	public JTextField getTextFieldAddTeacherHourlySalary() {
		return textFieldAddTeacherHourlySalary;
	}
	

	public JTextField getTextFieldAddCredits() {
		return textFieldAddCredits;
	}

	// LabelGetters

	public JTextArea getTextFieldErrorMessage() {
		return textAreaErrorMessageTeacher;
	}
	public JTextArea getTextFieldErrorMessageDepartment() {
		return textAreaErrorMessageDepartment;
	}
	public JTextArea getTextFieldErrorMessageCourses() {
		return textAreaErrorMessageCourses;

	}
	public JTextField getTextFieldResponsibleTeacher() {
		return textFieldResponsibleTeacher;
	}
	
	//LabelGetters


	public JScrollPane getScrollPane() {
		return scrollPaneTeacher;
	}


	public JTable getTeacherTable() {
		return teacherTable;
	}

	public JTable getCourseTable() {
		return courseTable;
	}

	public TeacherTableModel getTeacherTableModel() {
		return teacherTableModel;
	}

	public CourseTableModel getCourseTableModel() {
		return courseTableModel;
	}

	public void setTeacherTableModel(TeacherTableModel teacherTableModel) {
		this.teacherTableModel = teacherTableModel;
	}

	public CourseTeacherTableModel getCourseTeacherTableModel() {
		return courseTeacherTableModel;
	}



	public JScrollPane getScrollPaneCourse() {
		return scrollPaneCourse;

	}

	public JScrollPane getScrollPaneDepartment() {
		return scrollPaneDepartment;
	}

	public JScrollBar getScrollBarDepartment() {
		return scrollBarDepartment;
	}

	public JScrollBar getScrollBarCourse() {
		return scrollBarCourse;
	}

	public JTabbedPane getTabbedPane() {
		return tabbedPane;
	}

	public JPanel getPanel() {
		return panelAddTeacher;
	}

	public JPanel getPanelAddDepartment() {
		return panelAddDepartment;
	}

	public JTextArea getTextAreaErrorMessageDepartment() {
		return textAreaErrorMessageDepartment;
	}

	public JTextArea getTextAreaErrorMessageTeacher() {
		return textAreaErrorMessageTeacher;
	}

	public JTextArea getTextAreaErrorMessageCourses() {
		return textAreaErrorMessageCourses;
	}
	public JComboBox getComboBoxTeacherTitle() {
		return comboBoxTeacherTitle;
	}

	public JComboBox getComboBoxCoursesCycle() {
		return comboBoxCoursesCycle;
	}
	public JTextField getTextFieldTeacherDepartment() {
		return textFieldTeacherDepartment;
	}

	public JPanel getPanelAddTeacher() {
		return panelAddTeacher;
	}

	public JPanel getPanelAddCourses() {
		return panelAddCourses;
	}

	public JLabel getLblResponsibleTeacher() {
		return lblResponsibleTeacher;
	}

	public JLabel getLblTeacherDepartment() {
		return lblTeacherDepartment;
	}

	public JTable getCourseTeacherTable() {
		return courseTeacherTable;
	}

	public JTextField getTextFieldHours() {
		return textFieldHours;
	}

	public JButton getBtnAddCourseTeacher() {
		return btnAddCourseTeacher;
	}

	public JButton getBtnRemoveCourseTeacher() {
		return btnRemoveCourseTeacher;
	}
}
