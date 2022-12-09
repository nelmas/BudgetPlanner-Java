import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import assignment4.New.Person;

public class Controller implements ActionListener {

	private View view;
	private Teacher teacher;
	private Department department;
	private Course course;
	
	Controller(View view, Teacher teacher, Department department, Course course){
		this.view = view;
		this.teacher = teacher;
		this.department = department;
		this.course = course;
		declareListeners();

		
	}
	

	private void declareListeners() {
		view.getBtnAddDepartment().addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
			String departmentName = view.getTextFieldAddDepartmentName().getText();
			int budget = Integer.parseInt(view.getTextFieldAddDepartmentBudget().getText());
			String address = view.getTextFieldAddDepartmentAddress().getText();
		
			Department tmpDepartment = new Department();
			tmpDepartment.setName(departmentName);
			tmpDepartment.setBudget(budget);
			tmpDepartment.setAddress(address);
			
			
		if (budget > 0)	{
			department.addDepartment(tmpDepartment);
			System.out.println("hej");
		} else {
			System.out.println("då");

		}
						
				
			}
		});
	
	
	
		view.getBtnRemoveDepartment().addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				
				String departmentName = view.getTextFieldAddDepartmentName().getText();
				Department tmpDepartment = department.findDepartment(departmentName);
				department.removeDepartment(tmpDepartment);

				
			}});
		}
	
	
	
	
	
	
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub

	}
	
	}


