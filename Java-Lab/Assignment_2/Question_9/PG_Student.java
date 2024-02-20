package Assignment_2.Question_9;

public class PG_Student extends Student{
    private int semester;
    private double fees, stipend;

    PG_Student(int PRN, int age, String name, int semester, double fees, double stipend) {
        super(PRN, age, name);
        this.semester = semester;
        this.fees = fees;
        this.stipend = stipend;
    }

    public void print() {
        System.out.println("Information of UG Student => ");
        System.out.println("Name : "+name+" PRN : "+PRN+" Age : "+age+" Semester : "+semester+" Fees : "+fees+"Stipend : "+stipend);
    }

    public int get_semester() {
        return semester;
    }

    public int get_age() {
        return age;
    }
}
