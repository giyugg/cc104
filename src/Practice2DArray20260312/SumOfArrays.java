package Practice2DArray20260312;
import java.util.Scanner;
// Given a 2D array, compute the total sum of all numbers.
public class SumOfArrays {
    static void main(String[] args) {
        int[][] numbers = { {1, 2}, {3, 4} };
        int[][] matrix = new int[2][2];

        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                System.out.print(matrix[row][col] + " ");
            }
        }
    }
}
