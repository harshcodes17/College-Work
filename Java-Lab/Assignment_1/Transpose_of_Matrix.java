import java.util.Scanner;
public class Transpose_of_Matrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter number of Rows : ");
        int rows = scanner.nextInt();
        System.out.print("Enter Number of Colums : ");
        int cols = scanner.nextInt();

        int arr[][] = new int[rows][cols];
        System.out.println("Enter Elements of Matrix : ");
        for(int i = 0; i < rows; i++) {
            for(int j = 0; j < cols; j++) {
                arr[i][j] = scanner.nextInt();
            }
        }

        int ans[][] = new int[rows][cols];
        for(int i = 0; i < rows; i++) {
            for(int j = 0; j < cols; j++) {
                ans[i][j] = arr[j][i];
            }
        }

        System.out.println("Transpose of Matrix is : ");
        for (int[] it : ans) {
            for(int j : it) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
        scanner.close();
    }
}
