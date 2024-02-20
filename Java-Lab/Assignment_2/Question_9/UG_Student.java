package Assignment_2.Question_9;

public class UG_Student extends Student{
    private int semester;
    private double fees;

    UG_Student(int PRN, int age, String name, int semester, double fees) {
        super(PRN, age, name);
        this.semester = semester;
        this.fees = fees;
    }

    public void print() {
        System.out.println("Information of UG Student => ");
        System.out.println("Name : "+name+" PRN : "+PRN+" Age : "+age+" Semester : "+semester+" Fees : "+fees);
    }

    public int get_semester() {
        return semester;
    }

    public int get_age() {
        return age;
    }
}
