import java.util.ArrayList;

import javax.swing.table.AbstractTableModel;
	
//ArrayList of teacher objects

public class TeacherTableModel extends AbstractTableModel {
    private ArrayList<Teacher> teachers = new ArrayList<>();

    private String[] columns = {"Name", "EmployeeID", "Title", "Address", "Hourly Salary", "Department"};

    public void addTeacher(Teacher teacher) {
        teachers.add(teacher);
        this.fireTableDataChanged(); // Notify that TableData has changed
    }

    @Override
    public int getRowCount() {
        // TODO Auto-generated method stub
        return teachers.size(); //Return number of rows
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
        Teacher tmpTeacher = teachers.get(rowIndex); // Get the Teacher object at row index

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
            case 5:
                return tmpTeacher.getTeacherDepartment();
        }
        return null;
    }

    @Override
    public void setValueAt(Object val, int rowIndex, int columnIndex) {
        Teacher tmpTeacher = teachers.get(rowIndex);
        if (columnIndex == 0) {
            String newName = val.toString();
            tmpTeacher.setName(newName);
        } else if (columnIndex == 1) {
            String newEmployeeId = val.toString();
            tmpTeacher.setEmployeeId(newEmployeeId);
        } else if (columnIndex == 2) {
            String newTitle = val.toString();
            tmpTeacher.setTitle(newTitle);
        } else if (columnIndex == 3) {
            String newAddress = val.toString();
            tmpTeacher.setAddress(newAddress);
        } else if (columnIndex == 4) {
            String strSalary = val.toString();
            int newSalary = Integer.parseInt(strSalary.trim());
            if (newSalary > 0) {
                tmpTeacher.setHourlySalary(newSalary);
            }
        } else if (columnIndex == 5) {
            String newDepartment = val.toString();
            tmpTeacher.setTeacherDepartment(newDepartment);
        }


        this.fireTableCellUpdated(rowIndex, columnIndex);
    }

    public ArrayList<Teacher> getTeachers() {
        return teachers;
    }

    @Override
    public boolean isCellEditable(int rowIndex, int columnIndex) {

        return true;
    }

    public void removeRow(int rowIndex) {
        teachers.remove(rowIndex);
        fireTableRowsDeleted(rowIndex, rowIndex);
    }

    public Boolean findTeacherID(String identificationNumber) {
        for (Teacher teacher : teachers) {
            if (teacher.getEmployeeId().equals(identificationNumber)) {
                return true;
            }
        }
        return false;
    }

    public String findTeacherName(String identificationNumber) {
        for (Teacher teacher : teachers) {
            if (teacher.getEmployeeId().equals(identificationNumber)) {
                return teacher.getName();
            }
        }
        return "";
    }

    public String findTeacherTitle(String identificationNumber) {
        for (Teacher teacher : teachers) {
            if (teacher.getEmployeeId().equals(identificationNumber)) {
                return teacher.getTitle();
            }
        }
        return "";
    }
}
