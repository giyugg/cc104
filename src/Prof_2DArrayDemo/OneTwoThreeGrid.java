package Prof_2DArrayDemo;
import java.util.Scanner;

public class OneTwoThreeGrid {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Insert row: ");
        int rows = input.nextInt();
        System.out.print("Insert column: ");
        int cols = input.nextInt();

        int[][] grid = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                grid[i][j] = i + j + 1;
            }
        }
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(grid[i][j] + " ");
            }
            System.out.println();
        }
    }
}