package Assignment_2.Question_6;

public class Employee extends Department{
    protected String emp_name;

    public Employee(String departmentName, String emp_name) {
        super(departmentName);
        this.emp_name = emp_name;
    }

    public void emp_display() {
        System.out.println("Employee: " + emp_name);
    }
}
