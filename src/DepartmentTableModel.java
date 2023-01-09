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
	@Override
	public void setValueAt(Object val, int rowIndex, int columnIndex) {
		Department tmpDepartment = departmentRegister.get(rowIndex);
		if (columnIndex == 0) {
			String newName = val.toString();
			tmpDepartment.setName(newName);
		} else if (columnIndex == 1) {
			String strBudget = val.toString();
			int newBudget = Integer.parseInt(strBudget.trim());
			if (newBudget > 0) {
				tmpDepartment.setBudget(newBudget);
			}
		} else if (columnIndex == 2) {
			String newAddress = val.toString();
			tmpDepartment.setAddress(newAddress);
		}
		this.fireTableCellUpdated(rowIndex, columnIndex);
	}

	@Override
	public boolean isCellEditable(int rowIndex, int columnIndex) {
		return true;
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
