import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Random;

import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

public class Controller implements ActionListener {

    private View view;
    private Teacher teacher;
    private Department department;
    private Course course;
    private TeacherTableModel teacherTableModel;




    Controller(View view, Teacher teacher, Department department, Course course,
               TeacherTableModel teacherTableModel) {

        this.view = view;
        this.teacher = teacher;
        this.department = department;
        this.course = course;
        this.teacherTableModel = teacherTableModel;
        declareListeners();

    }

        // AddCourse
        private void declareListeners() {
        view.getBtnAddCourse().addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    String courseResponsible = view.getTextFieldResponsibleTeacher().getText();
                    String courseName = view.getTextFieldAddCourseName().getText();
                    
                    
                    
                    String firstLetters = courseName.substring(0, 2);

                    Random rnd = new Random();
                    int number = rnd.nextInt(99999);
                    String courseCode = firstLetters + String.format("%05d", number);

                    
                    
                    String cycle = view.getComboBoxCoursesCycle().getSelectedItem().toString();

                    String strCourseCredit = view.getTextFieldAddCredits().getText();

                    int courseCredit = Integer.parseInt(strCourseCredit.trim());

                    Course tmpCourse = new Course(courseName, courseCode, courseCredit, cycle, courseResponsible);

                    if (courseCredit < 0) {
                        view.getTextAreaErrorMessageCourses().setText("Credits can't have a negative value");
                    }
                    if (courseCredit > 30) {
                        view.getTextAreaErrorMessageCourses().setText("Credits can't be more than 30");
                    }

                    if (view.getTeacherTableModel().findTeacherID(courseResponsible) == false) {
                        view.getTextAreaErrorMessageCourses().setText("Check the ID for the responsible teacher!");
                    }
                    if (view.getCourseTableModel().findCourseCode(courseCode) == true) {
                        view.getTextAreaErrorMessageCourses().setText("Course code already exists!");
                    }
                    if (view.getTeacherTableModel().findTeacherID(courseResponsible) == true && view.getCourseTableModel().findCourseCode(courseCode) == false && courseCredit > 0 && courseCredit <= 30) {
                        view.getCourseTableModel().addCourse(tmpCourse);
                        teacher.addTaught(tmpCourse);
                    }
                } catch (NumberFormatException e3) {
                    view.getTextAreaErrorMessageCourses().setText("Credits must be entered in numbers");
                } catch (NullPointerException n) {
                    view.getTextAreaErrorMessageCourses().setText("Please enter cycle to continue");
                }
            }
        });

        //Remove course
        view.getBtnRemoveCourse().addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {

                    // för att ta bort från arraylist taught (), borde gå att använda find metod

                    String courseCode = view.getTextFieldCourseCode().getText();

								/*Course tmpCourse = course.findCourse(courseCode);

								teacher.removeTaught(tmpCourse);*/

                    // för att ta bort ut table
                    view.getCourseTableModel().removeRow(view.getCourseTable().getSelectedRow());

                } catch (IndexOutOfBoundsException exception) {
                    // för att buggen inte ska vara så extrem

//								System.out.println(" ");

                }

            }

        });

        // AddDepartment
        view.getBtnAddDepartment().addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    String departmentName = view.getTextFieldAddDepartmentName().getText();
                    String strDepartmentBudget = view.getTextFieldAddDepartmentBudget().getText();
                    int departmentBudget = Integer.parseInt(strDepartmentBudget);
                    String departmentAddress = view.getTextFieldAddDepartmentAddress().getText();

                    Department tmpDepartment = new Department(departmentName, departmentAddress, departmentBudget);

                    if (departmentName.isBlank()) {
                        view.getTextAreaErrorMessageDepartment().setText("Enter a name for your department!");
                    }
                    if (departmentBudget < 0) {
                        view.getTextAreaErrorMessageDepartment().setText("Budget can't have a negative value");
                    }
                    if (departmentAddress.isBlank()) {
                        view.getTextAreaErrorMessageDepartment().setText("Enter an address for your department!");
                    }
                    if (view.getDepartmentTableModel().findDepartment(departmentName) == true) {
                        view.getTextAreaErrorMessageDepartment().setText("Departments cannot have duplicate names!");
                    }
                    if (departmentName.isBlank() != true && departmentBudget > 0 && departmentAddress.isBlank() != true && view.getDepartmentTableModel().findDepartment(departmentName) == false) {
                        view.getDepartmentTableModel().addDepartment(tmpDepartment);
                        view.getTextAreaErrorMessageDepartment().setText("");
                    }

                } catch (NumberFormatException numberFormatException) {
                    view.getTextAreaErrorMessageDepartment().setText("Budget must be entered in numbers");
                }


            }
        });
        // Remove Department
        view.getBtnRemoveDepartment().addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (view.getDepartmentTable().getSelectedRow() != -1) {
                    view.getDepartmentTableModel().removeRow(view.getDepartmentTable().getSelectedRow());
                }

            }
        });


        // AddTeacher

        view.getBtnAddTeacher().addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                try {

                    String teacherName = view.getTextFieldAddTeacherName().getText();

                    String[] names = teacherName.split(" ");
                    String firstName = names[0];
                    String lastName = names[1];

                    String firstLetters = firstName.substring(0, 2);
                    String lastLetters = lastName.substring(0, 2);

                    Random rnd = new Random();
                    int number = rnd.nextInt(99999);

//     String.format("%05d", number) innebär att den ändrar formateringen så att den alltid visar fem siffror, kan börja på nolla

                    String teacherId = firstLetters + String.format("%04d", number) + lastLetters;
                    String teacherAddress = view.getTextFieldAddTeacherAddress().getText();
                    String strTeacherSalary = view.getTextFieldAddTeacherHourlySalary().getText();
                    String teacherTitle = view.getComboBoxTeacherTitle().getSelectedItem().toString();
                    String teacherDepartment = view.getTextFieldTeacherDepartment().getText();


                    int teacherSalary = Integer.parseInt(strTeacherSalary);
                    if (teacherSalary < 0) {
                        view.getTextAreaErrorMessageTeacher().setText("Hourly salary can't have a negative value");
                    }
                    if ((!view.getDepartmentTableModel().findDepartment(teacherDepartment))) {
                        view.getTextAreaErrorMessageTeacher().setText("Department does not exist");
                    } else {

                        Teacher tmpTeacher = new Teacher(teacherName, teacherId, teacherTitle, teacherAddress,
                                teacherSalary, teacherDepartment);
                        view.getTeacherTableModel().addTeacher(tmpTeacher);
                    }
                }
                 catch (NumberFormatException exception) {
                    view.getTextAreaErrorMessageTeacher().setText("Please enter only numbers as a salary!");
                } catch (IndexOutOfBoundsException exception) {
                    view.getTextAreaErrorMessageTeacher().setText("Please enter a first and a last name");
                }
                catch (NullPointerException exception) {
                    view.getTextAreaErrorMessageTeacher().setText("Please enter a valid department");
                }
            }
        });

        // Remove Teacher
        view.getBtnRemoveTeacher().addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (view.getTeacherTable().getSelectedRow() != -1) {
                    view.getTeacherTableModel().removeRow(view.getTeacherTable().getSelectedRow());
                }

            }
        });
    }

//		view.getBtnAddTeacher().addActionListener(new ActionListener() {
//			public void actionPerformed(ActionEvent e) {
//				try {
//					String teacherName = view.getTextFieldAddTeacherName().getText();
//					String teacherID = view.getTextFieldAddTeacherEmployeeID().getText();
//					
//					String TeacherID = "jdjdjd"
//					;
//					
//					
//					String teacherTitle = view.getTextFieldAddTeacherTitle().getText();
//					String teacherAddress = view.getTextFieldAddTeacherAddress().getText();
//					 String teacherSalary = view.getTextFieldAddTeacherHourlySalary().getText();
//					String strTeacherSalary = view.getTextFieldAddTeacherHourlySalary().getText();
//
//					int teacherSalary = Integer.parseInt(strTeacherSalary);
//
//				Teacher tmpTeacher = new Teacher(teacherName, teacherID, teacherTitle, teacherAddress, teacherSalary);
//				
//				view.getTeacherTableModel().addTeacher(tmpTeacher);
//				
//				
//			
//				
//				}catch (NumberFormatException exception) {
//					view.getTextFieldErrorMessageTeacher().setText("Please only enter numbers");
//				}	
//				
//					if (teacherSalary < 0) {
//						view.getTextFieldErrorMessageTeacher().setText("Hourly salary can't have a negative value");
//					} else {
//
//						Teacher tmpTeacher = new Teacher(teacherName, teacherID, teacherTitle, teacherAddress,
//								teacherSalary);
//
//						view.getTeacherTableModel().addTeacher(tmpTeacher);
//					}
//				} catch (NumberFormatException exception) {
//					view.getTextFieldErrorMessageTeacher().setText("Hourly salary must be entered in numbers");
//				}
//
//				Teacher tmpTeacher = new Teacher();
//				tmpTeacher.setAddress(teacherAddress);
//				tmpTeacher.setCourse(null);
//				tmpTeacher.setEmployeeId(teacherID);
//				tmpTeacher.setHourlySalary(teacherSalary);
//				tmpTeacher.setName(teacherName);
//				tmpTeacher.setTitle(teacherTitle);
//				tmpTeacher.setTaught(null);
//				
//	TeacherTableModel teacherTableModel = new TeacherTableModel();
//								
//				teacherTableModel.addTeacher(tmpTeacher);
//				
//	
//
//			}
//		});
//
//}

    @Override
    public void actionPerformed(ActionEvent e) {
        // TODO Auto-generated method stub

    }

}
