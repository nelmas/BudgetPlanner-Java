
import java.util.ArrayList;

import javax.swing.table.AbstractTableModel;

public class CourseTableModel extends AbstractTableModel {
    private ArrayList<Course> courses = new ArrayList<Course>();
    private String[] columns = {"Course Name", "Course Code", "ECTS", "Cycle", "Responsible", "Teacher Name"};


    public String[] getColumns() {
		return columns;
	}

	public void setColumns(String[] columns) {
		this.columns = columns;
	}

	public void addCourse(Course course) {
        courses.add(course);
        // defined in superclass
        this.fireTableDataChanged();
    }

    public void removeRow(int rowIndex) {
        courses.remove(rowIndex);
        fireTableRowsDeleted(rowIndex, rowIndex);
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
                return tmpCourse.getResponsibleId();
            case 5:
                return tmpCourse.getResponsibleName();
        }
        return null;

    }

    @Override
    public void setValueAt(Object val, int rowIndex, int columnIndex) {
        Course tmpCourse = courses.get(rowIndex);
        if (columnIndex == 0) {
            String newName = val.toString();
            tmpCourse.setName(newName);
        } else if (columnIndex == 1) {
            String newCourseCode = val.toString();
            tmpCourse.setCourseCode(newCourseCode);
        } else if (columnIndex == 2) {
            String strCredits = val.toString();
            int newCredits = Integer.parseInt(strCredits.trim());
            if (newCredits > 0) {
                tmpCourse.setCredits(newCredits);
            }
        } else if (columnIndex == 3) {
            String newCycle = val.toString();
            tmpCourse.setCycle(newCycle);
        } else if (columnIndex == 4) {
            String newResponsibleId = val.toString();
            tmpCourse.setResponsibleId(newResponsibleId);
        } else if (columnIndex == 5) {
              String newResponsibleName = val.toString();
              tmpCourse.setResponsibleName(newResponsibleName);
        }

        this.fireTableCellUpdated(rowIndex, columnIndex);
    }

    @Override
    public boolean isCellEditable(int rowIndex, int columnIndex) {

        return true;
    }

    public Boolean findCourseCode(String courseCode) {
        for (Course course : courses) {
            if (course.getCourseCode().equals(courseCode)) {
                return true;
            }
        }
        return false;
    }

    public int findTotalCredits(String identificationNumber) {
        int totalCredits = 0;
        for (Course course : courses) {
            if (course.getResponsibleId().equals(identificationNumber)) {
                totalCredits += course.getCredits();
            }
        }
        return totalCredits;
    }

    public int checkResponsibleCourses(String identificationNumber) {
        int count = 0;
        for (Course course :courses) {
            if (course.getResponsibleId().equals(identificationNumber)) {
                count += 1;
            }
        }
        return count;
    }
}
