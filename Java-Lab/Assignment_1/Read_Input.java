import java.util.Scanner;

public class Read_Input {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int intValue = scanner.nextInt();
        System.out.println("You entered: " + intValue);

        System.out.print("Enter a double: ");
        double doubleValue = scanner.nextDouble();
        System.out.println("You entered: " + doubleValue);

        System.out.print("Enter a string: ");
        String stringValue = scanner.next();
        System.out.println("You entered: " + stringValue);

        scanner.close();
    }
}
