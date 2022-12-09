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
		
		menuBar = new JMenuBar();
		this.setJMenuBar(menuBar);
    	departmentMenu = new JMenu("Department");
    	courseMenu = new JMenu("Course");
    	teacherMenu = new JMenu("Teacher");

    		menuBar.add(departmentMenu);
    		menuBar.add(courseMenu);
    		menuBar.add(teacherMenu);
    		addDepartmentItem = new JMenuItem("Add Department");
    		removeDepartmentItem = new JMenuItem("Remove Department");

    		departmentMenu.add(addDepartmentItem);
    		departmentMenu.add(removeDepartmentItem);


		
		this.setVisible(true);
	}
	}

