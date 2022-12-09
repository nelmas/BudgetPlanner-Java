import javax.swing.*;
import javax.swing.border.EmptyBorder;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.SystemColor;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class View extends JFrame {
	private JPanel contentPane;
	private JMenuBar menuBar;
	private JMenu departmentMenu;
	private JMenu courseMenu;
	private JMenu teacherMenu;
    private JMenuItem addDepartmentItem;
    private JMenuItem removeDepartmentItem;
    private JMenuItem getCourseInfoItem;
    private JMenuItem  editCourseItem;
    private JMenuItem editTeacherItem;
    private JMenuItem setHoursItem;
    private JMenuItem  displayTeachers;
    private JTabbedPane tabbedPane;
    private JPanel panel;
    private JPanel panelAddDepartment;
    private JTextField textFieldAddDepartmentName;
    private JTextField textField_1;
    private JTextField textField_2;
    private JTextField textField_3;
    private JTextField textField_4;
    private JTextField textField_5;
    private JTextField textField_6;
    private JTextField textField_7;
   
    
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
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(218, 137, 130, 26);
		panelAddDepartment.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(218, 196, 130, 26);
		panelAddDepartment.add(textField_2);
		
		JLabel lblDepartmentBudget = new JLabel("Budget");
		lblDepartmentBudget.setBounds(111, 142, 61, 16);
		panelAddDepartment.add(lblDepartmentBudget);
		
		JLabel lblDepartmentAddress = new JLabel("Address");
		lblDepartmentAddress.setBounds(111, 201, 61, 16);
		panelAddDepartment.add(lblDepartmentAddress);
		
		JButton btnAddDepartment = new JButton("Add");
		btnAddDepartment.setBounds(208, 251, 70, 26);
		panelAddDepartment.add(btnAddDepartment);
		
		JButton btnRemoveDepartment = new JButton("Remove");
		btnRemoveDepartment.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
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
		
		textField_4 = new JTextField();
		textField_4.setBounds(319, 6, 130, 26);
		textField_4.setColumns(10);
		panel.add(textField_4);
		
		textField_3 = new JTextField();
		textField_3.setBounds(319, 74, 130, 26);
		panel.add(textField_3);
		textField_3.setColumns(10);
		
		JLabel lblEmployeeID = new JLabel("EmployeeID");
		lblEmployeeID.setBounds(232, 79, 75, 16);
		panel.add(lblEmployeeID);
		
		textField_5 = new JTextField();
		textField_5.setBounds(319, 150, 130, 26);
		panel.add(textField_5);
		textField_5.setColumns(10);
		
		JLabel lblTitle = new JLabel("Title");
		lblTitle.setBounds(234, 155, 61, 16);
		panel.add(lblTitle);
		
		textField_6 = new JTextField();
		textField_6.setBounds(319, 229, 130, 26);
		panel.add(textField_6);
		textField_6.setColumns(10);
		
		JLabel lblAddress = new JLabel("Address");
		lblAddress.setBounds(234, 234, 61, 16);
		panel.add(lblAddress);
		
		textField_7 = new JTextField();
		textField_7.setBounds(319, 305, 130, 26);
		panel.add(textField_7);
		textField_7.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Hourly Salary");
		lblNewLabel.setBounds(232, 310, 86, 16);
		panel.add(lblNewLabel);
		
		JButton btnAddTeacher = new JButton("Add");
		btnAddTeacher.setBounds(320, 359, 117, 29);
		panel.add(btnAddTeacher);
		
		JButton btnRemoveTeacher = new JButton("remove");
		btnRemoveTeacher.setBounds(475, 74, 117, 29);
		panel.add(btnRemoveTeacher);
		
		JLabel lblNewLabel_1 = new JLabel("If you wish to remove a teacher from the system, only enter EmployeeID and press remove");
		lblNewLabel_1.setBounds(120, 46, 577, 16);
		panel.add(lblNewLabel_1);
		
	
	
		menuBar = new JMenuBar();
		this.setJMenuBar(menuBar);
    	departmentMenu = new JMenu("Department");
    	courseMenu = new JMenu("Course");
    	teacherMenu = new JMenu("Teacher");

    	//Department menu files
    		menuBar.add(departmentMenu);
    			addDepartmentItem = new JMenuItem("Add Department");
    			removeDepartmentItem = new JMenuItem("Remove Department");

    			departmentMenu.add(addDepartmentItem);
    			departmentMenu.add(removeDepartmentItem);
    			
    	//Course menu files
    		menuBar.add(courseMenu);
    			getCourseInfoItem = new JMenuItem("Get Course Info");
    			editCourseItem = new JMenuItem("Edit Course");
    
    			courseMenu.add(getCourseInfoItem);
    			courseMenu.add(editCourseItem);
    			
    			//Teacher menu files
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
}
