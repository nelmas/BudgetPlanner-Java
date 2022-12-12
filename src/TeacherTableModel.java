import java.util.ArrayList;

import javax.swing.table.AbstractTableModel;

public class TeacherTableModel extends AbstractTableModel {
	private ArrayList<Teacher> teachers = new ArrayList<Teacher>();
	private String[] columns = { "Name", "EmployeeID", "Title", "Address", "Hourly Salary" };

	public void addTeacher(Teacher teacher) {
		teachers.add(teacher);
		this.fireTableDataChanged();
	}

	@Override
	public int getRowCount() {
		// TODO Auto-generated method stub
		return teachers.size();
	}

	@Override
	public int getColumnCount() {
		// TODO Auto-generated method stub
		return columns.length;
	}

	@Override
	public String getColumnName(int columnIndex) {
		return columns[columnIndex];

	}

	@Override
	public Object getValueAt(int rowIndex, int columnIndex) {
		Teacher tmpTeacher = teachers.get(rowIndex);

		switch (columnIndex) {
		case 0:
			return tmpTeacher.getName();
		case 1:
			return tmpTeacher.getEmployeeId();
		case 2:
			return tmpTeacher.getTitle();
		case 3:
			return tmpTeacher.getAddress();
		case 4:
			return tmpTeacher.getHourlySalary();
		}

		return null;
	}

}