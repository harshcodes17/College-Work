package Assignment_2.Question_8;

public class Main {
    public static void main(String[] args) {
        Result res = new Result();
        UG_Result ug_res = new UG_Result();
        PG_Result pg_res = new PG_Result();
        System.out.println("Using object of Result Class =>");
        res.print_result();
        System.out.println("\nUsing object of UG_Result Class =>");
        ug_res.print_result();
        System.out.println("\nUsing object of PG_Result Class =>");
        pg_res.print_result();
    }
}
