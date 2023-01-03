import java.util.ArrayList;

import javax.swing.table.AbstractTableModel;

public class DepartmentTableModel extends AbstractTableModel {
	
	private ArrayList<Department> departmentRegister = new ArrayList<Department>();
	private String[] columns = { "Name", "Budget", "Address"};
	
	public void addDepartment(Department department) {
		departmentRegister.add(department);
		this.fireTableDataChanged();
	}
	@Override
	public int getRowCount() {
		// TODO Auto-generated method stub
		return departmentRegister.size();
	}
	@Override
	public int getColumnCount() {
		// TODO Auto-generated method stub
		return columns.length;
	}
	public String getColumnName(int columnIndex) {
		return columns[columnIndex];
	}
	@Override
	
	public Object getValueAt(int rowIndex, int columnIndex) {
		Department tmpDepartment = departmentRegister.get(rowIndex);

		switch (columnIndex) {
		case 0:
			return tmpDepartment.getName();
		case 1:
			return tmpDepartment.getBudget();
		case 2:
			return tmpDepartment.getAddress();
		}

		return null;
	}
	public void removeRow(int rowIndex) {
		departmentRegister.remove(rowIndex);
		fireTableRowsDeleted(rowIndex, rowIndex);
	}

	public Boolean findDepartment(String name) {
		for (Department department : departmentRegister) {
			if (department.getName().equals(name)) {
				return true;
			}
		}
		return false;
	}

	public ArrayList<Department> getDepartmentRegister() {
		return departmentRegister;
	}
}
