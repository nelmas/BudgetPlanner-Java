import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

public class CourseTeacherTableModel extends AbstractTableModel {
    private ArrayList<TeacherHours> hours = new ArrayList<>();
    private String[] columns = {"Teacher ID", "Course Code", "Hours Taught"};


    public void addHoursTaught(TeacherHours teacherHours) {
        hours.add(teacherHours);
        // defined in superclass
        this.fireTableDataChanged();
    }

    public void removeRow(int rowIndex) {
        hours.remove(rowIndex);
        fireTableRowsDeleted(rowIndex, rowIndex);
    }


    @Override
    public int getRowCount() {
        return hours.size();
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

        TeacherHours tmpHours = hours.get(rowIndex);

        switch (columnIndex) {
            case 0:
                return tmpHours.getEmployeeId();

            case 1:
                return tmpHours.getCourseCode();

           case 2:
                return tmpHours.getHoursTaught();
        }
        return null;
    }

    @Override
    public void setValueAt(Object val, int rowIndex, int columnIndex) {
        TeacherHours tmpHours = hours.get(rowIndex);
        if (columnIndex == 0) {
            String newEmployeeId = val.toString();
            tmpHours.setEmployeeId(newEmployeeId);
        } else if (columnIndex == 1) {
            String newCourseCode = val.toString();
            tmpHours.setCourseCode(newCourseCode);
        } else if (columnIndex == 2) {
            int newHoursTaught = (int) val;
            tmpHours.setHoursTaught(newHoursTaught);
        }
        this.fireTableCellUpdated(rowIndex, columnIndex);
    }

    @Override
    public boolean isCellEditable(int rowIndex, int columnIndex) {
        return true;
    }

    public int calculateHours(String identificationNumber) {
        int totalHours = 0;
        for (TeacherHours teacherHours: hours) {
            if (teacherHours.getEmployeeId().equals(identificationNumber)) {
                totalHours += teacherHours.getHoursTaught();
            }
        }
        return totalHours;
    }

    public Boolean isTeachingCourse(String identificationNumber, String courseCode) {
        for (TeacherHours teacherHours : hours) {
            if (teacherHours.getEmployeeId().equals(identificationNumber) && teacherHours.getCourseCode().equals(courseCode)) {
                return true;
            }
        }
        return false;
    }

}
