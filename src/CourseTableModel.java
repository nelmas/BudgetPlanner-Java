
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
//			return tmpCourse.getCycle();
//		case 4:
//			return tmpCourse.getResponsible();
//		case 5:
//			return tmpCourse.getTeaches();

		}
		return null;
	}

}
