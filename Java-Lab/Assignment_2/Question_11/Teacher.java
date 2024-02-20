package Assignment_2.Question_11;

public class Teacher { 
    protected String name, qualification;

    Teacher(String name, String qualification) {
        this.name = name;
        this.qualification = qualification;
    }

    public void display_info() {
        System.out.println("Teacher Name : "+this.name);
        System.out.println("Teacher Qualification : "+this.qualification);
    }
}