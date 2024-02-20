package Assignment_2.Question_6;

public class Department {
    protected String dept_name;

    public Department(String dept_name) {
        this.dept_name = dept_name;
    }

    public void dept_display() {
        System.out.println("Department: " + dept_name);
    }
}
