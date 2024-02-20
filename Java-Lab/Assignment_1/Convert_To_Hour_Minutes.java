import java.util.Scanner;
public class Convert_To_Hour_Minutes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the total seconds: ");
        int totalSeconds = scanner.nextInt();

        int hours = totalSeconds / 3600;  
        int remainingSeconds = totalSeconds % 3600;
        int minutes = remainingSeconds / 60;  

        System.out.println("Converted time: " + hours + " hours and " + minutes + " minutes");

        scanner.close();
    }
}
