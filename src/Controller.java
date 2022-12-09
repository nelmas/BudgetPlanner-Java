import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

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
		view.getAddDepartmentItem().addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				view.getPanel1();
				
				
				System.out.println("hej");
			}
		});
	
	}
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub

	}
	
	}


