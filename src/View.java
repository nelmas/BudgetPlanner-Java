import javax.swing.*;
import javax.swing.border.EmptyBorder;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.SystemColor;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.table.DefaultTableModel;

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
	private JPanel panel;
	private JPanel panelAddDepartment;

	// JTextFields
	private JTextField textFieldAddDepartmentName;
	private JTextField textFieldAddDepartmentBudget;
	private JTextField textFieldAddDepartmentAddress;
	private JTextField textFieldAddTeacherEmployeeID;
	private JTextField textFieldAddCredits;
	private JTextField textFieldCourseCode;
	private JTextField textFieldAddCourseName;
	private JTextField textFieldAddTeacherName;
	private JTextField textFieldAddTeacherTitle;
	private JTextField textFieldAddTeacherAddress;
	private JTextField textFieldAddTeacherHourlySalary;
	// JButtons
	private JButton btnAddTeacher;
	private JButton btnRemoveTeacher;
	private JButton btnAddDepartment;
	private JButton btnRemoveDepartment;
	private JButton btnAddCourse;
	private JButton btnRemoveCourse;

	// JLabels
	private JLabel lblCourseName;
	private JLabel lblCourseCode;
	private JLabel lblNewLabel_3;
	private JScrollPane scrollPane;
	private JTable table;

	public View() {

		setTitle("Contoso University");
		setBackground(SystemColor.control);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 863, 681);

		contentPane = new JPanel();

		contentPane.setBackground(SystemColor.control);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(6, 6, 851, 522);
		contentPane.add(tabbedPane);

		panelAddDepartment = new JPanel();
		tabbedPane.addTab("Deparment", null, panelAddDepartment, null);
		panelAddDepartment.setLayout(null);

		textFieldAddDepartmentName = new JTextField();
		textFieldAddDepartmentName.setBounds(218, 73, 130, 26);
		panelAddDepartment.add(textFieldAddDepartmentName);
		textFieldAddDepartmentName.setColumns(10);

		JLabel lbldepartmentName = new JLabel("Name");
		lbldepartmentName.setBounds(111, 78, 61, 16);
		panelAddDepartment.add(lbldepartmentName);

		textFieldAddDepartmentBudget = new JTextField();
		textFieldAddDepartmentBudget.setBounds(218, 137, 130, 26);
		textFieldAddDepartmentBudget.setColumns(10);
		panelAddDepartment.add(textFieldAddDepartmentBudget);

		textFieldAddDepartmentAddress = new JTextField();
		textFieldAddDepartmentAddress.setBounds(218, 196, 130, 26);
		textFieldAddDepartmentAddress.setColumns(10);
		panelAddDepartment.add(textFieldAddDepartmentAddress);

		JLabel lblDepartmentBudget = new JLabel("Budget");
		lblDepartmentBudget.setBounds(111, 142, 61, 16);
		panelAddDepartment.add(lblDepartmentBudget);

		JLabel lblDepartmentAddress = new JLabel("Address");
		lblDepartmentAddress.setBounds(111, 201, 61, 16);
		panelAddDepartment.add(lblDepartmentAddress);

		btnAddDepartment = new JButton("Add");
		btnAddDepartment.setBounds(208, 251, 70, 26);
		panelAddDepartment.add(btnAddDepartment);

		btnRemoveDepartment = new JButton("Remove");
		btnRemoveDepartment.setBounds(276, 251, 93, 27);
		panelAddDepartment.add(btnRemoveDepartment);

		JLabel lblNewLabel_2 = new JLabel("If you wish to remove a department, enter name and press remove");
		lblNewLabel_2.setBounds(111, 48, 428, 16);
		panelAddDepartment.add(lblNewLabel_2);

		panel = new JPanel();
		tabbedPane.addTab("Teacher", null, panel, null);
		panel.setLayout(null);

		JLabel lblFullName = new JLabel("Full Name");
		lblFullName.setBounds(232, 11, 63, 16);
		panel.add(lblFullName);

		textFieldAddTeacherName = new JTextField();
		textFieldAddTeacherName.setBounds(319, 6, 130, 26);
		textFieldAddTeacherName.setColumns(10);
		panel.add(textFieldAddTeacherName);

		textFieldAddTeacherEmployeeID = new JTextField();
		textFieldAddTeacherEmployeeID.setBounds(319, 74, 130, 26);
		panel.add(textFieldAddTeacherEmployeeID);
		textFieldAddTeacherEmployeeID.setColumns(10);

		JLabel lblEmployeeID = new JLabel("EmployeeID");
		lblEmployeeID.setBounds(232, 79, 75, 16);
		panel.add(lblEmployeeID);

		textFieldAddTeacherTitle = new JTextField();
		textFieldAddTeacherTitle.setBounds(319, 150, 130, 26);
		panel.add(textFieldAddTeacherTitle);
		textFieldAddTeacherTitle.setColumns(10);

		JLabel lblTitle = new JLabel("Title");
		lblTitle.setBounds(234, 155, 61, 16);
		panel.add(lblTitle);

		textFieldAddTeacherAddress = new JTextField();
		textFieldAddTeacherAddress.setBounds(319, 229, 130, 26);
		panel.add(textFieldAddTeacherAddress);
		textFieldAddTeacherAddress.setColumns(10);

		JLabel lblAddress = new JLabel("Address");
		lblAddress.setBounds(234, 234, 61, 16);
		panel.add(lblAddress);

		textFieldAddTeacherHourlySalary = new JTextField();
		textFieldAddTeacherHourlySalary.setBounds(319, 305, 130, 26);
		panel.add(textFieldAddTeacherHourlySalary);
		textFieldAddTeacherHourlySalary.setColumns(10);

		JLabel lblNewLabel = new JLabel("Hourly Salary");
		lblNewLabel.setBounds(232, 310, 86, 16);
		panel.add(lblNewLabel);

		btnAddTeacher = new JButton("Add");
		btnAddTeacher.setBounds(320, 359, 117, 29);
		panel.add(btnAddTeacher);

		btnRemoveTeacher = new JButton("remove");
		btnRemoveTeacher.setBounds(475, 74, 117, 29);
		panel.add(btnRemoveTeacher);

		JLabel lblNewLabel_1 = new JLabel(
				"If you wish to remove a teacher from the system, only enter EmployeeID and press remove");
		lblNewLabel_1.setBounds(120, 46, 577, 16);
		panel.add(lblNewLabel_1);
		
		scrollPane = new JScrollPane();
		scrollPane.setBounds(475, 150, 324, 228);
		panel.add(scrollPane);
		
		table = new JTable();
		
		
		scrollPane.setViewportView(table);
		
		TeacherTableModel teacherTableModel = new TeacherTableModel();
		
		table.setModel(teacherTableModel);
		
		JScrollBar scrollBar = new JScrollBar();
		scrollPane.setRowHeaderView(scrollBar);

		JPanel panel_1 = new JPanel();
		tabbedPane.addTab("Courses", null, panel_1, null);
		panel_1.setLayout(null);

		textFieldAddCourseName = new JTextField();
		textFieldAddCourseName.setBounds(329, 52, 130, 26);
		panel_1.add(textFieldAddCourseName);
		textFieldAddCourseName.setColumns(10);

		lblCourseName = new JLabel("Name");
		lblCourseName.setBounds(230, 57, 80, 16);
		panel_1.add(lblCourseName);

		textFieldAddCredits = new JTextField();
		textFieldAddCredits.setBounds(329, 111, 130, 26);
		panel_1.add(textFieldAddCredits);
		textFieldAddCredits.setColumns(10);

		JLabel lblCourseCredits = new JLabel("Credits");
		lblCourseCredits.setBounds(230, 116, 61, 16);
		panel_1.add(lblCourseCredits);

		textFieldCourseCode = new JTextField();
		textFieldCourseCode.setBounds(329, 187, 130, 26);
		panel_1.add(textFieldCourseCode);
		textFieldCourseCode.setColumns(10);

		lblCourseCode = new JLabel("CourseCode");
		lblCourseCode.setBounds(230, 192, 80, 16);
		panel_1.add(lblCourseCode);

		lblNewLabel_3 = new JLabel("If you wish to remove a Course, only enter the CourseCode and press remove");
		lblNewLabel_3.setBounds(140, 159, 485, 16);
		panel_1.add(lblNewLabel_3);

		btnAddCourse = new JButton("Add");
		btnAddCourse.setBounds(308, 236, 87, 29);
		panel_1.add(btnAddCourse);

		btnRemoveCourse = new JButton("Remove");
		btnRemoveCourse.setBounds(394, 236, 87, 29);
		panel_1.add(btnRemoveCourse);

		menuBar = new JMenuBar();
		this.setJMenuBar(menuBar);
		departmentMenu = new JMenu("Department");
		courseMenu = new JMenu("Course");
		teacherMenu = new JMenu("Teacher");

		// Department menu files
		menuBar.add(departmentMenu);
		addDepartmentItem = new JMenuItem("Add Department");
		removeDepartmentItem = new JMenuItem("Remove Department");

		departmentMenu.add(addDepartmentItem);
		departmentMenu.add(removeDepartmentItem);

		// Course menu files
		menuBar.add(courseMenu);
		getCourseInfoItem = new JMenuItem("Get Course Info");
		editCourseItem = new JMenuItem("Edit Course");

		courseMenu.add(getCourseInfoItem);
		courseMenu.add(editCourseItem);

		// Teacher menu files
		menuBar.add(teacherMenu);
		editTeacherItem = new JMenuItem("Edit Teacher Info");
		setHoursItem = new JMenuItem("Set Hours for Teacher");
		displayTeachers = new JMenuItem("Display Teachers");

		teacherMenu.add(editTeacherItem);
		teacherMenu.add(setHoursItem);
		teacherMenu.add(displayTeachers);

		this.setVisible(true);
	}

	public JPanel getContentPane() {
		return contentPane;
	}

//	public JMenuBar getMenuBar() {
//		return menuBar;
//	}

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

	// button getters
	public JTextField getTextFieldAddTeacherEmployeeID() {
		return textFieldAddTeacherEmployeeID;
	}
	public JTextField getTextFieldAddTeacherName() {
		return textFieldAddTeacherName;
	}

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

	public JMenuBar getMenuBar() {
		return menuBar;
	}

	public JTabbedPane getTabbedPane() {
		return tabbedPane;
	}

	public JPanel getPanel() {
		return panel;
	}

	public JPanel getPanelAddDepartment() {
		return panelAddDepartment;
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

	public JTextField getTextFieldAddCredits() {
		return textFieldAddCredits;
	}

	public JTextField getTextFieldCourseCode() {
		return textFieldCourseCode;
	}

	public JTextField getTextFieldAddCourseName() {
		return textFieldAddCourseName;
	}

	public JTextField getTextFieldAddTeacherTitle() {
		return textFieldAddTeacherTitle;
	}

	public JTextField getTextFieldAddTeacherAddress() {
		return textFieldAddTeacherAddress;
	}

	public JTextField getTextFieldAddTeacherHourlySalary() {
		return textFieldAddTeacherHourlySalary;
	}

	public JLabel getLblCourseName() {
		return lblCourseName;
	}

	public JLabel getLblCourseCode() {
		return lblCourseCode;
	}

	public JLabel getLblNewLabel_3() {
		return lblNewLabel_3;
	}

	public JScrollPane getScrollPane() {
		return scrollPane;
	}

	public JTable getTable() {
		return table;
	}
}
