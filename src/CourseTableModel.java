
import java.util.ArrayList;

import javax.swing.table.AbstractTableModel;

public class CourseTableModel extends AbstractTableModel {
	private ArrayList<Course> courses = new ArrayList<Course>();
	private String[] columns = { "Name", "Course Code", "ECTS", "Cycle", "Responsible", "Teachers" };
	
	
	public void addCourse(Course course) {
		courses.add(course);
		// defined in superclass
		this.fireTableDataChanged();
	}
	public void removeRow(int rowIndex) {
		courses.remove(rowIndex);
 		//fireTableRowsDeleted(rowIndex,rowIndex);
		this.fireTableDataChanged();
		
		
		}
	


	@Override
	public int getRowCount() {
		return courses.size();
	}
  
	@Override
	public int getColumnCount() {
		return columns.length;
	}

	@Override
	public String getColumnName(int columnIndex) {
		return columns[columnIndex];
	}

	@Override
	public Object getValueAt(int rowIndex, int columnIndex) {

		Course tmpCourse = courses.get(rowIndex);

		switch (columnIndex) {
		case 0:
			return tmpCourse.getName();
		case 1:
			return tmpCourse.getCourseCode();
		case 2:
			return tmpCourse.getCredits();
		case 3:
			return tmpCourse.getCycle();
		case 4:
			return tmpCourse.getResponsible();
		case 5:
			return tmpCourse.getTeaches();

		}
		return null;

	}
	
	@Override
	public void setValueAt(Object val, int rowIndex, int columnIndex) {
		Course tmpCourse = courses.get(rowIndex);
		if(columnIndex == 0) {
			String newName = val.toString();
			tmpCourse.setName(newName);
		} else if (columnIndex == 1) {
			String newCourseCode = val.toString();
			tmpCourse.setCourseCode(newCourseCode);
		} else if (columnIndex == 2) {
		int newCredits = (int) val;
		tmpCourse.setCredits(newCredits);
	} else if (columnIndex == 3) {
		String newCycle = val.toString();
		tmpCourse.setCycle(newCycle);
		
	}	
		this.fireTableCellUpdated(rowIndex, columnIndex);
	}

	@Override
public boolean isCellEditable(int rowIndex, int columnIndex) {
		
		return true;
	}
	

}
