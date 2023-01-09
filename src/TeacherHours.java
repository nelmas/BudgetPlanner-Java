import java.util.ArrayList;
public class TeacherHours {
    private String employeeId;
    private String courseCode;
    private int hoursTaught;

    public TeacherHours () {

    }
    public TeacherHours (String employeeId, String courseCode, int hoursTaught) {
        this.employeeId = employeeId;
        this.courseCode = courseCode;
        this.hoursTaught = hoursTaught;
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public String getCourseCode() {
        return courseCode;
    }

    public void setCourseCode(String courseCode) {
        this.courseCode = courseCode;
    }

    public int getHoursTaught() {
        return hoursTaught;
    }

    public void setHoursTaught(int hoursTaught) {
        this.hoursTaught = hoursTaught;
    }
}
