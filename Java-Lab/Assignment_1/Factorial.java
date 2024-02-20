import java.util.Scanner;
public class Factorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter any Number :");
        int num = scanner.nextInt();

        int ans = 1;
        for(int i = 1; i <= num; i++) {
            ans = ans * i;
        }

        System.out.println("Factorial of " + num + " is " + ans);

        scanner.close();
    }
}
