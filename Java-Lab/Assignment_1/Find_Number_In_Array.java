import java.util.Scanner;
public class Find_Number_In_Array {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();

        int[] arr = new int[size];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            System.out.print("Element " + (i + 1) + ": ");
            arr[i] = scanner.nextInt();
        }

        boolean ifTen = false;
        boolean ifTwenty = false;

        for (int i = 0; i < size; i++) {
            if (arr[i] == 10) {
                ifTen = true;
            }
            if (ifTen && arr[i] == 20) {
                ifTwenty = true;
                break; 
            }
        }

        if (ifTen && ifTwenty) {
            System.out.println("The array contains 10 and has a 20 later in the array.");
        } else {
            System.out.println("The array does not meet the specified conditions.");
        }

        scanner.close();
    }
}
