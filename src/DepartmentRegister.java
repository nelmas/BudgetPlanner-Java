import java.util.ArrayList;




public class DepartmentRegister {
private ArrayList<Department> departmentRegister = new ArrayList<Department>();
	public ArrayList<Department> getDepartmentRegister() {
	return departmentRegister;
}
public void setDepartmentRegister(ArrayList<Department> departmentRegister) {
	this.departmentRegister = departmentRegister;
}
	
	public void addDepartment(Department department) {
		this.departmentRegister.add(department);
	}

	public void removeDepartment(Department department) {
		this.departmentRegister.remove(department);
	}
		
		public Department findDepartment(String name) {
			for (Department department : departmentRegister) {
				if (department.getName().equals(name)) {
					return department;
				}
			}
			return null;
		}
	
	
	
}
	


