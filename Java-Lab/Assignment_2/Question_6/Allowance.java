package Assignment_2.Question_6;

public class Allowance extends Employee{
    private double amount;

    public Allowance(String departmentName, String employeeName, double amount) {
        super(departmentName, employeeName);
        this.amount = amount;
    }

    public void allowance_display() {
        System.out.println("Allowance for " + emp_name + ": " + amount);
    }
}
