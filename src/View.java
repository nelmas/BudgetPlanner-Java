import javax.swing.*;
import javax.swing.border.EmptyBorder;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.SystemColor;
import java.awt.Color;

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
    private JButton btnNewButton;
    private JTextField textField;
    private JTextField textField_1;
    private JTextField textField_2;
   
    
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
		tabbedPane.addTab("New tab", null, panelAddDepartment, null);
		panelAddDepartment.setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(218, 73, 130, 26);
		panelAddDepartment.add(textField);
		textField.setColumns(10);
		
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
		
		JLabel lblDepartmentAddress = new JLabel("New label");
		lblDepartmentAddress.setBounds(111, 201, 61, 16);
		panelAddDepartment.add(lblDepartmentAddress);
		
		panel = new JPanel();
		tabbedPane.addTab("New tab", null, panel, null);
		
		btnNewButton = new JButton("New button");
		panel.add(btnNewButton);
		
	
	
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
