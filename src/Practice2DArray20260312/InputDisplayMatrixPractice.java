package Practice2DArray20260312;
import java.util.Scanner;
// Ask the user to input values for a 2×3 matrix, then print the matrix.
public class InputDisplayMatrixPractice {
    static void main(String[] args) {
        Scanner value = new Scanner(System.in);
        int[][] matrix = new int[2][3];

        System.out.print("Enter numbers: ");
        for (int row = 0; row < matrix.length; row++) {
            for (int column = 0; column < matrix[row].length; column++) {
                matrix[row][column] = value.nextInt();
                System.out.print(matrix[row][column] + " ");
            } System.out.println();
        }
    }
}
