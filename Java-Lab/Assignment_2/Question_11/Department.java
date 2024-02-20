package Assignment_2.Question_11;

public class Department extends Teacher implements College{
    int deptNo;
    String deptName;

    Department(String name, String qualification, int deptNo, String deptName) {
        super(name, qualification);
        this.deptNo = deptNo;
        this.deptName = deptName;
    }

    public void display_college_info() {
        System.out.println("College Name: WCE"); 
        System.out.println("Department Number: " + deptNo);
        System.out.println("Department Name: " + deptName);
    }
}
