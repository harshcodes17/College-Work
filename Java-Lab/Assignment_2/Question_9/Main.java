package Assignment_2.Question_9;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        UG_Student[] ug_students = new UG_Student[5];
        PG_Student[] pg_students = new PG_Student[5];

        System.out.println("Enter Data for 5 Undergraduate Students => ");
        for(int i = 0; i < 5; i++) {
            System.out.println("Enter Data for PRN, Name, Age, Semester, Fees for UG Student "+(i + 1)+" : ");
            int PRN = scanner.nextInt();
            String name = scanner.next();
            int age = scanner.nextInt();
            int semester = scanner.nextInt();
            double fees = scanner.nextDouble();
            ug_students[i] = new UG_Student(PRN, age, name, semester, fees);
        }

        System.out.println("Enter Data for 5 Post-Graduate Students => ");
        for(int i = 0; i < 5; i++) {
            System.out.println("Enter Data for PRN, Name, Age, Semester, Fees, Stipend for UG Student "+(i + 1)+" : ");
            int PRN = scanner.nextInt();
            String name = scanner.next();
            int age = scanner.nextInt();
            int semester = scanner.nextInt();
            double fees = scanner.nextDouble();
            double stipend = scanner.nextDouble();
            pg_students[i] = new PG_Student(PRN, age, name, semester, fees, stipend);
        }

        scanner.close();

        int ug_students_age[] = new int[8];
        int ug_student_cnt[] = new int[8];

        int pg_student_age[] = new int[4];
        int pg_student_cnt[] = new int[4];

        for(int i = 0; i < 5; i++) {
            int sem = ug_students[i].get_semester();
            int age = ug_students[i].get_age();
            ug_students_age[sem - 1] += age;
            ug_student_cnt[sem - 1]++;
        }

        for(int i = 0; i < 5; i++) {
            int sem = pg_students[i].get_semester();
            int age = pg_students[i].get_age();
            pg_student_age[sem - 1] += age;
            pg_student_cnt[sem - 1]++;
        }

        System.out.println("Semester wise average age for Undergraduate Student is => ");
        for(int i = 0; i < 8; i++) {
            double ans = 0;
            if(ug_student_cnt[i] != 0) {
                ans = (double) ug_students_age[i] / ug_student_cnt[i];
            }
            System.out.println("Average age for Semester " + (i + 1)+" is "+ ans);
        }

        System.out.println();

        System.out.println("Semester wise average age for Post-Graduate Student is => ");
        for(int i = 0; i < 8; i++) {
            double ans = 0;
            if(ug_student_cnt[i] != 0) {
                ans = (double) pg_student_age[i] / pg_student_cnt[i];
            }
            System.out.println("Average age for Semester " + (i + 1)+" is "+ ans);
        }
    }
}
