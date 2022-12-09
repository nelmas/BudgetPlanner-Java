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
    private JPanel panel1;
    private JPanel panel;
    
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
		tabbedPane.setBounds(6, 6, 851, 533);
		contentPane.add(tabbedPane);
		
		panel1 = new JPanel();
		panel1.setBackground(Color.PINK);
		tabbedPane.addTab("New tab", null, panel1, null);
		
		panel = new JPanel();
		panel.setBackground(Color.RED);
		//tabbedPane.addTab("New tab", null, panel, null);
		
	
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
	public JPanel getPanel1() {
		return panel1;
	}
	
	public JPanel getPanel() {
		return panel;
	}
	
	
	}

