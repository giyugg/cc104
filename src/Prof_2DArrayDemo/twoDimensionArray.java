package Prof_2DArrayDemo;
import java.util.Scanner;

public class twoDimensionArray {
    static int Row = 3;
    static int Column = 2;

    public static void main(String[] args) {
        int[][] matrix = {
                {10, 20, 30}, // Row 0
                {40, 50, 60}, // Row 1
                {70, 80, 90}, // Row 2
        };
        System.out.println("Element at row 1, column 2: " + matrix[1][2]); // Output: 60

        // Loop through and print all elements using a nested for-each loop
        System.out.println("All elements:");
        for (int[] row : matrix) {
            for (int num : row) {
                System.out.print(num + " ");
            }
            System.out.println(); // Move to the next line for the next row
        }
    }
}
